package flipkart.dao;

import flipkart.models.Airline;
import flipkart.models.Features;
import flipkart.models.Flight;
import flipkart.models.Location;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FlightDao {
    Map<String, Flight> flights;

    public FlightDao() {
        flights = new HashMap<String, Flight>();
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public void setFlights(Map<String, Flight> flights) {
        this.flights = flights;
    }
}
