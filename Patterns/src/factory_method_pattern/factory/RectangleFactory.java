package factory_method_pattern.factory;

import factory_method_pattern.factory.ShapeFactory;
import factory_method_pattern.product.Rectangle;
import factory_method_pattern.product.Shape;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
