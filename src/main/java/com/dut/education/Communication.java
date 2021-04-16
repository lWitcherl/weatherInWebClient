package com.dut.education;

import com.dut.education.entity.CityWeather;
import com.dut.education.entity.exception.NoSuchCityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
@Component
public class Communication {
    private RestTemplate restTemplate;
    private Properties p = new Properties();
    private final String URL ;
    private final String SIMPLEINF = "api/cityweather";

    Communication() throws IOException {
        String part = Communication.class.getClassLoader().getResource("webSetting.properties").getPath();
        p.load(new FileInputStream(part));
        URL = p.getProperty("URL");
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CityWeather getCityWeather(String var) throws NoSuchCityException{
        CityWeather cityWeather;
        try {
            cityWeather= restTemplate.getForObject(URL+SIMPLEINF+"/"+var, CityWeather.class);
        }catch (Exception e ){
            throw new NoSuchCityException("city by :"+ var +" not found");
        }
        return cityWeather;
    }

    public CityWeather getCityWeather(double lon,double lat){
        CityWeather cityWeather = restTemplate.getForObject(URL+SIMPLEINF+"/"+lon+"/"+lat, CityWeather.class);
        return cityWeather;
    }

}


