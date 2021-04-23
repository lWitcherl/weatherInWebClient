package com.dut.education.controllers;

import com.dut.education.entity.exception.NoSuchCityByCordException;
import com.dut.education.entity.exception.NoSuchCityException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ModelAndView noSuchCityException(NoSuchCityException e, Model model){
        model.addAttribute("error", e.getMessage());
        model.addAttribute("hidden", "");
        return new ModelAndView("main");
    }
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ModelAndView  noSuchCityByCordException(NoSuchCityByCordException e, Model model){
        model.addAttribute("error", e.getMessage());
        model.addAttribute("hidden", "");
        return new ModelAndView("extendedSearch");
    }

}
