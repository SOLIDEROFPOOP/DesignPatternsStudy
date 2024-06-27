package factory_method_pattern.factory;

import factory_method_pattern.factory.ShapeFactory;
import factory_method_pattern.product.Circle;
import factory_method_pattern.product.Shape;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

}
