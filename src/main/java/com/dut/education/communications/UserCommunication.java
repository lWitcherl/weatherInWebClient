package com.dut.education.communications;


import com.dut.education.entity.UserDetailsImp;
import com.dut.education.entity.UserInfo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


import java.util.Properties;

@Component
public class UserCommunication {
    private RestTemplate restTemplate;
    HttpHeaders headers = new HttpHeaders();
    MultiValueMap<String, String> map;
    private final String URL;
    private final String SIMPLEINF = "/user";
    private boolean result ;

    public UserCommunication(RestTemplate restTemplate,@Qualifier("setting") Properties properties) {
        this.restTemplate = restTemplate;
        URL = properties.getProperty("URL");
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
    }

    public UserInfo getUserInfo(String name){
        UserInfo userInfo;
        map= new LinkedMultiValueMap<>();
        map.add("username", name);
        userInfo = restTemplate.postForEntity( URL+SIMPLEINF+"/info",
                new HttpEntity<>(map, headers) , UserInfo.class ).getBody();
        return userInfo;
    }
    public UserDetails getUserDetail(String name){
        UserDetailsImp userDetails;
        map= new LinkedMultiValueMap<>();
        map.add("username", name);
        userDetails = restTemplate.postForEntity( URL+SIMPLEINF+"/auth",
                new HttpEntity<>(map, headers) , UserDetailsImp.class ).getBody();
        return userDetails;
    }

    public boolean checkUsername(String username) {
        map= new LinkedMultiValueMap<>();
        map.add("username", username);
        result = restTemplate.postForEntity( URL+SIMPLEINF+"/check",
                new HttpEntity<>(map, headers) , boolean.class ).getBody();
        return result;
    }

    public boolean checkEmail(String email){
        map= new LinkedMultiValueMap<>();
        map.add("email", email);
        result = restTemplate.postForEntity( URL+SIMPLEINF+"/check",
                new HttpEntity<>(map, headers) , boolean.class ).getBody();
        return result;
    }
    public boolean saveNewUser(UserInfo user){
        headers.setContentType(MediaType.APPLICATION_JSON);
        result = restTemplate.postForEntity( URL+SIMPLEINF+"/save",
                new HttpEntity<>(user, headers) , boolean.class ).getBody();
        return result;
    }
    public boolean updateCityList(String name, String id){
        map= new LinkedMultiValueMap<>();
        map.add("username", name);
        map.add("id", id);
        result = restTemplate.postForEntity( URL+SIMPLEINF+"/update",
                new HttpEntity<>(map, headers) , boolean.class ).getBody();
        return result;
    }
    public boolean delCity(String name, String id){
        map= new LinkedMultiValueMap<>();
        map.add("username", name);
        map.add("id", id);
        result = restTemplate.postForEntity( URL+SIMPLEINF+"/del",
                new HttpEntity<>(map, headers) , boolean.class ).getBody();
        return result;
    }

}
