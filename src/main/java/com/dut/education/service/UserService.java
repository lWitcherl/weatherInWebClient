package com.dut.education.service;

import com.dut.education.communications.UserCommunication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    private UserCommunication userCommunication;

    public UserService(UserCommunication userCommunication) {
        this.userCommunication = userCommunication;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        UserDetails userDetails = userCommunication.getUserDetail(s);
        if(userDetails==null) throw new UsernameNotFoundException("User not found");
        return userDetails;
    }
}
