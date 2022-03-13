package com.example.demo;

public interface Equipment {
    public String toString();
    public Boolean isWaterproof();
    public default float getWeight() {
        return 0; // Default weight of equipment is insignificant (like documents)
    }
}
