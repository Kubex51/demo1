package com.example.demo;


import javax.persistence.*;

@Entity
@Table(name = "docks")
public class Port {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private double latitude;
    private double longitude;
    private boolean sleepover;
    private boolean refuel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isSleepover() {
        return sleepover;
    }

    public void setSleepover(boolean sleepover) {
        this.sleepover = sleepover;
    }

    public boolean isRefuel() {
        return refuel;
    }

    public void setRefuel(boolean refuel) {
        this.refuel = refuel;
    }

    @Override
    public String toString() {
        return "Port{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", sleepover=" + sleepover +
                ", refuel=" + refuel +
                '}';
    }
}
