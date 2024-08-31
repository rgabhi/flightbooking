package flipkart.models;

import flipkart.utilities.FlightIdGenerator;

import java.util.Random;

public class Flight {
    private String id;
    private Airline airline;
    private Location source;
    private Location destination;
    private double price;

    public Flight(String id, Airline airline, Location source, Location destination, double price) {
        this.id = id;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        price = price;
    }

    @Override
    public String toString() {
        return source.getCode() + " to " + destination.getCode() + " via " + airline.getName() + " for " + price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Location getSource() {
        return source;
    }

    public void setSource(Location source) {
        this.source = source;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
