package factory_method_pattern.factory;

import factory_method_pattern.product.Shape;

public abstract class ShapeFactory {
    public abstract Shape createShape();
    public void drawShape(){
        Shape shape = createShape();
        shape.draw();
    }
}
