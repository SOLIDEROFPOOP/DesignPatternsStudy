package factory_method_pattern.product;

import factory_method_pattern.product.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
