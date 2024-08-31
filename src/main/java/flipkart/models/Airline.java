package flipkart.models;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Airline {
    private String name;
    private Set<Features> features;

    public Airline(String name, List<Features> features) {
        this.name = name;
        this.features = new TreeSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Features> getFeatures() {
        return features;
    }

    public void setFeatures(Set<Features> features) {
        this.features = features;
    }
}
