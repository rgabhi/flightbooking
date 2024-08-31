package flipkart.services.strategies;

import flipkart.dao.FlightDao;
import flipkart.models.Features;
import flipkart.models.Flight;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CheapestStrategy implements SearchStrategy {

    @Override
    public List<Flight> searchFlight(String route_id, FlightDao flightDao, Set<Features> filters) {
        Set<Flight> flights = flightDao.getRoutes().get(route_id);
        return flights.stream().sorted((a, b)-> (int) (a.getPrice() - b.getPrice())).toList();
    }
}