package factoryDesign;

import factoryDesign.ShapeFactory;

public class Main {
    public static void main(String args[]){
        ShapeFactory shape = new ShapeFactory();
        Shape r = shape.getShape("4");
        r.draw();
    }
}