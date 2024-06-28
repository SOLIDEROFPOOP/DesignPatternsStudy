package abstract_factory_pattern.abstract_products;

import abstract_factory_pattern.abstract_products.Car;
import abstract_factory_pattern.abstract_products.CarSpecification;

public interface CarFactory {
    Car createCar();
    public CarSpecification createCarSpecification();
}
