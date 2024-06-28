package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.CarSpecification;

public class NorthAmericaSpecification implements CarSpecification {
    @Override
    public void display() {
        System.out.println("North America Car Specification: Safety features compliant with local regulations.");
    }
}