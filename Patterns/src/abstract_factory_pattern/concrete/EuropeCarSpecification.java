package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.Car;
import abstract_factory_pattern.abstract_products.CarSpecification;

public class EuropeCarSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}
