package com.dut.education.controllers;

import com.dut.education.communications.UserCommunication;
import com.dut.education.entity.UserInfo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller()
@RequestMapping("/access")
public class AccessController {
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    private UserCommunication userCommunication;

    public AccessController(BCryptPasswordEncoder bCryptPasswordEncoder, UserCommunication userCommunication) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.userCommunication = userCommunication;
    }

    @GetMapping("/registration")
    public String registrationView(Model model){
        model.addAttribute("user",new UserInfo());
        return "registration";
    }
    @PostMapping("/registration")
    public String registrationPost(@Valid @ModelAttribute("user") UserInfo userInfo, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "registration";
        }
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userCommunication.saveNewUser(userInfo);
        return "redirect:/login";
    }
}
