package modulo6.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by JavierSainz on 6/3/17.
 */
class Shipment {
    public double calculateWeight() {
        double weight = 0; // Calculate weight
        return weight;
    }
}


public class TestShipment {
    public static void main(String[] args) {
        List<Shipment> l = new ArrayList<Shipment>();
        // Using an anonymous class
        calculateOnShipments(l, new Function<Shipment, Double>() {
            public Double apply(Shipment s) {
                // The object
                return s.calculateWeight(); // The method
            }
        });
        Shipment s2 = new Shipment();
        // Using a lambda expression
        calculateOnShipments(l, s -> s.calculateWeight()); // Using a method reference
        calculateOnShipments(l, Shipment::calculateWeight);
    }

    public static List<Double> calculateOnShipments(List<Shipment> l, Function<Shipment, Double> f) {
        List<Double> results = new ArrayList<>();
        for (Shipment s : l) {
            results.add(f.apply(s));
        }
        return results;
    }
}
