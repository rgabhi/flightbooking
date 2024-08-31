package flipkart.utilities;

import flipkart.models.Location;

public class RouteIdGenerator {
    public static String generateRouteId(Location source, Location destination){
        return source.getCode() + "_" + destination.getCode();
    }
}
