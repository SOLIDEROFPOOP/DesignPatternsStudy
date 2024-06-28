package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.Car;

public class HatchBack implements Car {
    @Override
    public void assemble() {
        System.out.println("assembling HatchBack");
    }
}
