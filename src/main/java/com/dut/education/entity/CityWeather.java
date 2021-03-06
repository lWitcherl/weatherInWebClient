package com.dut.education.entity;

public class CityWeather {
    private int cityId;
    private String name;
    private String region;
    private float temp;
    private float feelsLike;
    private String time;
    private String weather;
    private int humidity;
    private int clouds;
    private double precipitation;
    private String icon;

    public CityWeather() {
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getClouds() {
        return clouds;
    }

    public void setClouds(int clouds) {
        this.clouds = clouds;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(float feelsLike) {
        this.feelsLike = feelsLike;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "CityWeather{" +
                "cityId=" + cityId +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", time='" + time + '\'' +
                ", weather='" + weather + '\'' +
                ", humidity=" + humidity +
                ", clouds=" + clouds +
                ", precipitation=" + precipitation +
                ", icon='" + icon + '\'' +
                '}';
    }
}
