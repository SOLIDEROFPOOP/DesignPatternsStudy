package abstract_factory_pattern.concrete;

import abstract_factory_pattern.abstract_products.Car;
import abstract_factory_pattern.abstract_products.CarFactory;
import abstract_factory_pattern.abstract_products.CarSpecification;

public class NorthAmericaCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Sedan();
    }
    public CarSpecification carSpecification(){
        return new NorthAmericaSpecification();
    }

    @Override
    public CarSpecification createCarSpecification() {
        return new NorthAmericaSpecification();
    }
}
