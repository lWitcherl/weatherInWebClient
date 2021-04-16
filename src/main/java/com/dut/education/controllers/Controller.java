package com.dut.education.controllers;

import com.dut.education.Communication;
import com.dut.education.entity.CityWeather;
import com.dut.education.entity.exception.ExceptionInfo;
import com.dut.education.entity.exception.NoSuchCityException;
import com.dut.education.translators.TranslatorHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public String startPage(){
        return "main";
    }

    @GetMapping("/search")
    public String search(HttpServletRequest request,Model model) throws NoSuchCityException{
        CityWeather cityWeather;
        if(request.getParameter("lon")!=null){
            double lon = Double.parseDouble(request.getParameter("lon"));
            double lat = Double.parseDouble(request.getParameter("lon"));
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
    /*@GetMapping("/search")
    public String search(HttpServletRequest request,Model model) throws NoSuchCityException{*/

    @GetMapping("/extendedSearch")
    public String extendSearch(Model model){
       model.addAttribute("hidden","hidden");
       return "extendedSearch";
    }

}
