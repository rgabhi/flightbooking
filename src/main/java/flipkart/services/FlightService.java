package flipkart.services;

import flipkart.dao.FlightDao;
import flipkart.models.Airline;
import flipkart.models.Features;
import flipkart.models.Flight;
import flipkart.models.Location;
import flipkart.services.strategies.CheapestStrategy;
import flipkart.services.strategies.SearchStrategy;
import flipkart.utilities.FlightIdGenerator;
import flipkart.utilities.RouteIdGenerator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FlightService {

    private FlightDao flightDao;
    public FlightService() {
        this.flightDao = new FlightDao();
    }

    //REGISTER FLIGHT
    public void addFlight(Airline airline, Location sourceLocation, Location destinationLocation, double price) {
        String id = FlightIdGenerator.generateFlightId(airline.getName(), sourceLocation.getCode(), destinationLocation.getCode());
        if(flightDao.getFlights().containsKey(id)){
            System.out.println("Flight already exists");
            return;
        }
        Flight flight = new Flight(id, airline, sourceLocation, destinationLocation, price);
        flightDao.getFlights().put(id, flight);
        String routeId = RouteIdGenerator.generateRouteId(sourceLocation, destinationLocation);
        if(!flightDao.getRoutes().containsKey(routeId)){
            flightDao.getRoutes().put(routeId, new HashSet<>());
        }
        flightDao.getRoutes().get(routeId).add(flight);
        System.out.println(flight.getAirline().getName() + " " + sourceLocation.getCode() + " -> " + destinationLocation.getCode() + " registered");
    }

    // SEARCH FLIGHT
    public void getFlight(String route_id, List<Features> filters) {
        SearchStrategy cheapestStrategy = new CheapestStrategy();
        Set<Features> filterSet = new TreeSet<>(filters);
        List<Flight> flightsCheapest =  cheapestStrategy.searchFlight(route_id, flightDao, filterSet);
        System.out.println(flightsCheapest);

    }
}
