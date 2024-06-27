package factory_method_pattern.product;

import factory_method_pattern.product.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}
