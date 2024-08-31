package flipkart.utilities;

public class FlightIdGenerator {
    public static String generateFlightId(String airline, String source, String destination) {
        return airline + "_" + source + "_" + destination;
    }
}
