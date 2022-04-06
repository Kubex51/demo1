package com.example.demo.boat;

public class BoatCapability {
    private float rangeInNM;
    private float shipDWTinKgs;
    private float shipLightWeightInKgs;

    public float getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(float averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    private float averageSpeed;

    private float length;
    private float width;
    private float draft;
    private int cabins;
    private int berths;
    private int toilets;

    public BoatCapability(float rangeInNM, float shipDWTinKgs, float shipLightWeightInKgs) {
        this.rangeInNM = rangeInNM;
        this.shipDWTinKgs = shipDWTinKgs;
        this.shipLightWeightInKgs = shipLightWeightInKgs;
    }

    public float getRangeInNM() {
        return rangeInNM;
    }

    public void setRangeInNM(float rangeInNM) {
        this.rangeInNM = rangeInNM;
    }

    public float getShipDWTinKgs() {
        return shipDWTinKgs;
    }

    public void setShipDWTinKgs(float shipDWTinKgs) {
        this.shipDWTinKgs = shipDWTinKgs;
    }

    public float getShipLightWeightInKgs() {
        return shipLightWeightInKgs;
    }

    public void setShipLightWeightInKgs(float shipLightWeightInKgs) {
        this.shipLightWeightInKgs = shipLightWeightInKgs;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getDraft() {
        return draft;
    }

    public void setDraft(float draft) {
        this.draft = draft;
    }

    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }

    public int getBerths() {
        return berths;
    }

    public void setBerths(int berths) {
        this.berths = berths;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }
}
