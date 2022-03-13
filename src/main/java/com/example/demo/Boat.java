package com.example.demo;

public class Boat {
    private String manufacturer;
    private String model;
    private String name;

    private String registration;
    private Person owner;
    private BoatCapability capability;

    public Boat(String name, BoatCapability capability) {
        this.name = name;
        this.capability = capability;
    }

    public Boat(String manufacturer, String model, String name, BoatCapability capability) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.name = name;
        this.capability = capability;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getName() {
        return this.name;
    }

    public String getRegistration() {
        return this.registration;
    }

    public Person getOwner() {
        return this.owner;
    }

    public BoatCapability getCapability() {
        return this.capability;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public void setCapability(BoatCapability capability) {
        this.capability = capability;
    }
}
