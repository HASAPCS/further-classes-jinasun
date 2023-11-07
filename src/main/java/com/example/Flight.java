package com.example;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String flightNumber;
    private String destination;
    private String origin;
    private List<Passenger> passengers;

    public Flight(String flightNumber, String destination, String origin) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.origin = origin;
        this.passengers = new ArrayList<Passenger>();
    }

    public void bookPassenger (Passenger passenger) {
        passengers.add(passenger);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getOrigin() {
        return origin;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }
    // TODO: Implement methods to book a flight for a passenger and cancel a booking
}
