package factoryDesign;

import factoryDesign.Circle;

public class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("This is a circle");
    }
}