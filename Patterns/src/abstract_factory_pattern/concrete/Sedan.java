package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.Car;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car");
    }
}
