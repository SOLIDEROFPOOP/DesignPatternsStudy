package abstract_factory_pattern;

import abstract_factory_pattern.abstract_products.Car;
import abstract_factory_pattern.abstract_products.CarFactory;
import abstract_factory_pattern.abstract_products.CarSpecification;
import abstract_factory_pattern.concrete.EuropeCarFactory;
import abstract_factory_pattern.concrete.NorthAmericaCarFactory;

public class CarFactoryClient {
    public static void main(String[] args){
        CarFactory northAmericaCarFactory = new NorthAmericaCarFactory();
        Car northAmericaCar = northAmericaCarFactory.createCar();
        CarSpecification northAmericaSpecification = northAmericaCarFactory.createCarSpecification();

        northAmericaCar.assemble();
        northAmericaSpecification.display();

        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec = europeFactory.createCarSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
