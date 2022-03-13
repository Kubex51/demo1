package com.example.demo;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class Voyage {
    private List<Person> peopleOnboard;
    private Boat boat;
    private List<Equipment> equipmentOnBoard;
    private Location departureLocation;
    private Location arrivalLocation;
    private List<Location> waypoints;

    public Voyage(List<Person> peopleOnboard, Boat boat, List<Equipment> equipmentOnBoard, Location departureLocation, Location arrivalLocation) {
        this.peopleOnboard = peopleOnboard;
        this.boat = boat;
        this.equipmentOnBoard = equipmentOnBoard;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    public float getVoyageLength(){
        if (Objects.isNull(this.waypoints)) return (float) departureLocation.distanceTo(arrivalLocation);
        float length = (float) departureLocation.distanceTo(waypoints.get(0));
        for(int i = 0; i < waypoints.size() - 1; i++){
            length += waypoints.get(i).distanceTo(waypoints.get(i+1));
        }
        length += waypoints.get(waypoints.size() - 1).distanceTo(arrivalLocation);
        return length;
    }

    public Duration getVoyageDuration(float Speed){
        Duration duration = Duration.ofSeconds((long) (getVoyageLength()/Speed*3600));
        return duration;
    }

    public List<Person> getPeopleOnboard() {
        return peopleOnboard;
    }

    public void setPeopleOnboard(List<Person> peopleOnboard) {
        this.peopleOnboard = peopleOnboard;
    }

    public Boat getBoat() {
        return boat;
    }

    public void setBoat(Boat boat) {
        this.boat = boat;
    }

    public List<Equipment> getEquipmentOnBoard() {
        return equipmentOnBoard;
    }

    public void setEquipmentOnBoard(List<Equipment> equipmentOnBoard) {
        this.equipmentOnBoard = equipmentOnBoard;
    }

    public Location getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public List<Location> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<Location> waypoints) {
        this.waypoints = waypoints;
    }
}
