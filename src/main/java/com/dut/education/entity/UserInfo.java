package com.dut.education.entity;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

public class UserInfo {

    @Pattern(regexp = "\\w{4,10}",message = "use lat.char length 4-10")
    private String username;
    @Email
    private String email;
    private List<Integer> favoriteCity;
    @Pattern(regexp = "\\w{6,16}",message = "use lat.char length 6-10")
    private String password=null;

    public UserInfo() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Integer> getFavoriteCity() {
        return favoriteCity;
    }

    public void setFavoriteCity(List<Integer> favoriteCity) {
        this.favoriteCity = favoriteCity;
    }
}
