package flipkart.services.strategies;

import flipkart.dao.FlightDao;
import flipkart.models.Flight;

import java.util.List;

public class CheapestStrategy implements SearchStrategy {
    @Override
    public List<Flight> searchFlight(String id, FlightDao flightDao) {
        return null;
    }
}
