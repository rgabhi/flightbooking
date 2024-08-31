package flipkart.services;

import flipkart.dao.FlightDao;
import flipkart.models.Airline;
import flipkart.models.Flight;
import flipkart.models.Location;
import flipkart.services.strategies.CheapestStrategy;
import flipkart.services.strategies.SearchStrategy;
import flipkart.utilities.FlightIdGenerator;

import java.util.List;

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
        System.out.println(flight.getAirline().getName() + " " + sourceLocation.getCode() + " -> " + destinationLocation.getCode() + " registered");
    }

    // SEARCH FLIGHT
    public void getFlight(String id) {
        SearchStrategy cheapestStrategy = new CheapestStrategy();
        List<Flight> flightsCheapest =  cheapestStrategy.searchFlight(id, flightDao);
        System.out.println(flightsCheapest);

    }
}
