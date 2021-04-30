package com.dut.education.controllers;

import com.dut.education.communications.UserCommunication;
import com.dut.education.entity.UserInfo;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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
    public String registrationPost(@ModelAttribute("user") UserInfo userInfo){
        userInfo.setPassword(bCryptPasswordEncoder.encode(userInfo.getPassword()));
        userCommunication.saveNewUser(userInfo);
        return "redirect:/login";
    }
}
