package factory_method_pattern;

import factory_method_pattern.factory.CircleFactory;
import factory_method_pattern.factory.RectangleFactory;
import factory_method_pattern.factory.ShapeFactory;

public class FactoryMethodPatternDemo {
    public static void main(String[] args){
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        circleFactory.drawShape();
        rectangleFactory.drawShape();
    }
}
