package com.dut.education.controllers;

import com.dut.education.Communication;
import com.dut.education.entity.CityWeather;
import com.dut.education.entity.exception.NoSuchCityByCordException;
import com.dut.education.entity.exception.NoSuchCityException;
import com.dut.education.translators.TranslatorHandler;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    private Communication communication;
    private TranslatorHandler translatorHandler;

   Controller(Communication communication,TranslatorHandler translatorHandler){
       this.communication=communication;
       this.translatorHandler=translatorHandler;
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
            System.out.println(lon+" "+lat +" ---");
            cityWeather = communication.getCityWeather(lon,lat);
        }else if (request.getParameter("region")!=null){
            String city = translatorHandler.reformatTypeCharacters(request.getParameter("city"));
            cityWeather = communication.getCityWeather(city+","+request.getParameter("region"));
        }else {
            String city = translatorHandler.reformatTypeCharacters(request.getParameter("city"));
            cityWeather = communication.getCityWeather(city);
        }
        model.addAttribute("weather", cityWeather);
        System.out.println(cityWeather);
        return "weather";
    }


    @GetMapping("/extendedSearch")
    public String extendSearch(){
       return "extendedSearch";
    }

}
