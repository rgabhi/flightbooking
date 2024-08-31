package flipkart.services.strategies;

import flipkart.dao.FlightDao;
import flipkart.models.Features;
import flipkart.models.Flight;

import java.util.List;
import java.util.Set;

public interface SearchStrategy {
    public List<Flight> searchFlight(String route_id, FlightDao flightDao, Set<Features> filters);
}
