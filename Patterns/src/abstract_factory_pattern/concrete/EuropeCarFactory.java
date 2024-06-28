package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.Car;
import abstract_factory_pattern.abstract_products.CarFactory;
import abstract_factory_pattern.abstract_products.CarSpecification;

public class EuropeCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new HatchBack();
    }



    @Override
    public CarSpecification createCarSpecification() {
        return new EuropeCarSpecification();
    }
}
