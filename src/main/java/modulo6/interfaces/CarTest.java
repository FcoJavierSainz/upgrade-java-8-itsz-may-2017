package modulo6.interfaces;

import modulo6.functional.Car;
import modulo6.functional.CarType;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Created by JavierSainz on 6/2/17.
 */

public class CarTest {
    public static void main(String[] args) {
        List<Car> cars = getCars();
        cars = findCars(cars, car -> car.getType().equals(CarType.COMPACT));
        cars = findCars(cars, car -> car.getCostUSD() > 20000);
        System.out.println(cars);
        System.out.println(cars.size());

    }

    static List<Car> findCars(List<Car> cars, Predicate<Car> p) {
        List<Car> compactCars = new ArrayList<>();
        for (Car car : cars) {
            if (p.test(car)) {
                compactCars.add(car);
            }
        }
        return compactCars;
    }

    static List<Car> getCars() {
        ArrayList<Car> cars = new ArrayList<>(20);
        cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_000));
        cars.add(new Car(CarType.COMPACT, "Honda", "City", 20_000));
        cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
        cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
        cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_800));
        cars.add(new Car(CarType.COMPACT, "Honda", "City", 22_000));
        cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
        cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
        cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 21_000));
        cars.add(new Car(CarType.COMPACT, "Honda", "City", 19_999));
        cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
        cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
        cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 20_500));
        cars.add(new Car(CarType.COMPACT, "Honda", "City", 22_000));
        cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
        cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
        cars.add(new Car(CarType.HATCHBACK, "Honda", "Fit", 19_000));
        cars.add(new Car(CarType.COMPACT, "Honda", "City", 19_000));
        cars.add(new Car(CarType.SEDAN, "Honda", "Civic", 28_000));
        cars.add(new Car(CarType.SUV, "Honda", "Pilot", 35_000));
        return cars;
    }

    class Chapter {
        private Optional<String> summary;
    }
}

