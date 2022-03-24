package com.example.demo;

public class WindyApiParams {
    double lat;
    double lon;
    String model;
    String[] parameters;
    String[] levels;
    String key;

    public WindyApiParams(double lat, double lon, String model, String[] parameters, String[] levels, String key) {
        this.lat = lat;
        this.lon = lon;
        this.model = model;
        this.parameters = parameters;
        this.levels = levels;
        this.key = key;
    }
}
