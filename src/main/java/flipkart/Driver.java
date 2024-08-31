package flipkart;

import flipkart.models.Airline;
import flipkart.models.Location;
import flipkart.services.FlightService;
import flipkart.utilities.RouteIdGenerator;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        FlightService flightService = new FlightService();
        Scanner scanner = new Scanner(System.in);

        while (true){
            String command = scanner.nextLine();
            String[] commandArgs = command.split("->");
            switch (commandArgs[0].strip()){
                case "register flight":
                    Airline airline = new Airline(commandArgs[1].strip(), null);
                    Location source = new Location(commandArgs[2].strip());
                    Location destination = new Location(commandArgs[3].strip());
                    flightService.addFlight(airline, source, destination, Double.parseDouble(commandArgs[4].strip()));
                    break;
                case "search flight":
//                    flightService.getFlight();
                    break;
                    //
                case "exit":
                    return;
            }
        }

    }
}