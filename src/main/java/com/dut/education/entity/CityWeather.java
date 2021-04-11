package com.dut.education.entity;

public class CityWeather {
    private String name;
    private float temp;
    private float feelsLike;
    private String time;
    private String weather;

    public CityWeather() {
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
                "name='" + name + '\'' +
                ", temp=" + temp +
                ", feelsLike=" + feelsLike +
                ", time=" + time +
                ", weather='" + weather + '\'' +
                '}';
    }
}
