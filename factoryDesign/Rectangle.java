package factoryDesign;

import factoryDesign.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw(){
        System.out.println("This is a rectangle");
    }
}