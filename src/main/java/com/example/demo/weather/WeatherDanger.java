package com.example.demo.weather;


import org.springframework.data.util.Pair;

public interface WeatherDanger {
    public String toString();
    public Pair<String,WeatherParams> getDanger();
}
