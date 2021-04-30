package com.dut.education.communications;

import com.dut.education.entity.CityWeather;
import com.dut.education.entity.exception.NoSuchCityByCordException;
import com.dut.education.entity.exception.NoSuchCityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


import java.util.Properties;
@Component
public class WeatherCommunication {
    private RestTemplate restTemplate;
    private Properties properties;
    private final String URL ;
    private final String SIMPLEINF = "api/cityweather";

    WeatherCommunication(@Qualifier("setting")Properties properties) {
        this.properties = properties;
        URL = this.properties.getProperty("URL");
    }

    @Autowired
    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CityWeather getCityWeather(String var) throws NoSuchCityException{
        CityWeather cityWeather;
        try {
            cityWeather= restTemplate.getForObject(URL+SIMPLEINF+"/"+var, CityWeather.class);
        }catch (HttpClientErrorException e ){
            throw new NoSuchCityException("city by :"+ var +" not found");
        }
        return cityWeather;
    }
    public CityWeather getCityWeatherById(int id) {
        CityWeather cityWeather;
        try {
            cityWeather= restTemplate.getForObject(URL+SIMPLEINF+"/"+id, CityWeather.class);
        }catch (HttpClientErrorException e ){
            cityWeather = null;
        }
        return cityWeather;
    }

    public CityWeather getCityWeather(double lon,double lat)throws NoSuchCityByCordException{
        CityWeather cityWeather;
        try {
            cityWeather = restTemplate.getForObject(URL+SIMPLEINF+"/"+lon+"/"+lat, CityWeather.class);
        }catch (Exception e ){
            throw new NoSuchCityByCordException("city by :" + lon+ " " +lat +" not found");
        }
        return cityWeather;
    }

}


