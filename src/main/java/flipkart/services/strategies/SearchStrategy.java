package flipkart.services.strategies;

import flipkart.dao.FlightDao;
import flipkart.models.Flight;

import java.util.List;

public interface SearchStrategy {
    public List<Flight> searchFlight(String id, FlightDao flightDao);
}
