package com.dut.education;

import com.dut.education.entity.CityWeather;
import com.dut.education.entity.WeatherFromApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    public CityWeather getCityWeather(String var){
        CityWeather cityWeather  = restTemplate.getForObject(URL+SIMPLEINF+"/"+var, CityWeather.class);
        return cityWeather;
    }

    public CityWeather getCityWeather(int lon,int lat){
        CityWeather cityWeather = restTemplate.getForObject(URL+SIMPLEINF+"/"+lon+"/"+lat, CityWeather.class);
        return cityWeather;
    }

}


