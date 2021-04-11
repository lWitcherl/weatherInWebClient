package com.dut.education.controllers;

import com.dut.education.Communication;
import com.dut.education.entity.CityWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import javax.servlet.http.HttpServletRequest;

@org.springframework.stereotype.Controller
public class Controller {
    private Communication communication;

    @Autowired
    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

    @GetMapping("/")
    public String startPage(){
        return "main";
    }

    @GetMapping("/search")
    public String search(HttpServletRequest request,Model model){
        System.out.println(request.getParameter("param"));
        CityWeather cityWeather = communication.getCityWeather(request.getParameter("param"));
        model.addAttribute("weather",cityWeather);
        System.out.println(cityWeather);
        return "showWeather";
    }


}