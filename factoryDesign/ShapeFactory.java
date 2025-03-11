package factoryDesign;

public class ShapeFactory {
    public Shape getShape(String edges) {
        switch(edges){
            case "-1":
                return new Circle();
            case "4":
                return new Rectangle();
            default:
                return null;
        }
    }
}