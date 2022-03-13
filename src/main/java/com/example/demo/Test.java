package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Qualifications qualifications = new Qualifications(Qualifications.YachtQualifications.INLAND_SKIPPER, Qualifications.MotorboatQualifications.NONE);
        Person person = new Person("Test", "Testowy", qualifications);

        BoatCapability boatCapability = new BoatCapability(5000,3000,9200);
        boatCapability.setAverageSpeed(6.2f);
        Boat boat = new Boat("Bavaria", "42","Evergiven", boatCapability);


        List<Person> peopleOnBoard = new ArrayList<Person>();
        List<Equipment> equipment = new ArrayList<Equipment>();
        peopleOnBoard.add(person);
        Location departureLocation = new Location("Gdynia", 54.54225207991667, 18.553176488728095);
        Location arrivalLocation = new Location("Stockholm", 59.34964752135034, 18.108110231254845);
        Voyage voyage = new Voyage(peopleOnBoard,boat,equipment,departureLocation,arrivalLocation);
        List<Location> waypoints = new ArrayList<Location>();
        waypoints.add(new Location("w1",54.5639, 19.2826));
        waypoints.add(new Location("w2",59.7000, 20.1869));
        voyage.setWaypoints(waypoints);
        System.out.println(voyage.getVoyageLength());
        System.out.println(voyage.getVoyageDuration(boat.getCapability().getAverageSpeed()));
    }
}
