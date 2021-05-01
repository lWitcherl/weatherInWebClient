package com.dut.education.controllers;

import com.dut.education.communications.UserCommunication;
import com.dut.education.communications.WeatherCommunication;
import com.dut.education.entity.CityWeather;
import com.dut.education.entity.UserInfo;
import com.dut.education.entity.exception.NoSuchCityByCordException;
import com.dut.education.entity.exception.NoSuchCityException;
import com.dut.education.translators.TranslatorHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.ArrayList;

@Controller
public class CommonController {
    private WeatherCommunication weatherCommunication;
    private TranslatorHandler translatorHandler;
    private UserCommunication userCommunication;

    public CommonController(WeatherCommunication weatherCommunication, TranslatorHandler translatorHandler, UserCommunication userCommunication) {
        this.weatherCommunication = weatherCommunication;
        this.translatorHandler = translatorHandler;
        this.userCommunication = userCommunication;
    }

    @GetMapping("/")
    public String startPage(Model model) {
        model.addAttribute("hidden","hidden");
        return "main";
    }

    @GetMapping("/search")
    public String search(HttpServletRequest request,Model model) throws NoSuchCityException, NoSuchCityByCordException {
        CityWeather cityWeather;
        if(request.getParameter("lon")!=null){
            double lon = Double.parseDouble(request.getParameter("lon").replace(",","."));
            double lat = Double.parseDouble(request.getParameter("lat").replace(",","."));
            cityWeather = weatherCommunication.getCityWeather(lon,lat);
        }else if (request.getParameter("region")!=null){
            String city = translatorHandler.reformatTypeCharacters(request.getParameter("city"));
            cityWeather = weatherCommunication.getCityWeather(city+","+request.getParameter("region"));
        }else {
            String city = translatorHandler.reformatTypeCharacters(request.getParameter("city"));
            cityWeather = weatherCommunication.getCityWeather(city);
        }
        model.addAttribute("weather", cityWeather);
        return "weather";
    }

    @GetMapping("/extendedSearch")
    public String extendSearch(){
       return "extendedSearch";
    }
    @GetMapping("/addcity")
    public String addCity(HttpServletRequest httpServletRequest,Principal principal){
        userCommunication.updateCityList(principal.getName(),httpServletRequest.getParameter("id"));
       return "redirect:/profile";
    }
    @GetMapping("/delcity")
    public String delCity(HttpServletRequest httpServletRequest,Principal principal){
        userCommunication.delCity(principal.getName(),httpServletRequest.getParameter("id"));
       return "redirect:/profile";
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal) {
       UserInfo userInfo = userCommunication.getUserInfo(principal.getName());
       ArrayList<CityWeather> citys =  new ArrayList<>();
       for (Integer i :userInfo.getFavoriteCity()){
           citys.add(weatherCommunication.getCityWeatherById(i));
       }
       model.addAttribute("citys",citys);
       return "profile";
    }


}
