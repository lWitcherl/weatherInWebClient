package com.dut.education.controllers;

import com.dut.education.entity.exception.ExceptionInfo;
import com.dut.education.entity.exception.NoSuchCityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler
    public ModelAndView unknownException(NoSuchCityException e, Model model){
        model.addAttribute("error", e.getMessage());
        model.addAttribute("hidden", "");
        System.out.println("Exception handler");
        return new ModelAndView("extendedSearch");
    }

}
