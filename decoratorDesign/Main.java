package decoratorDesign;

import decoratorDesign.*;

public class Main {
    public static void main(String args[]) {
        BasePizza pizza = new BasePizzaImpl();
        BasePizza veg = new VegDelight();

        ExtraCheese finalorder1 = new ExtraCheese(pizza);
        System.out.println(finalorder1.cost());

        ExtraCheese finalorder2 = new ExtraCheese(veg);
        System.out.println(finalorder2.cost());

        BasePizza order = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println("This is the decorated slice");
        System.out.println(order.cost());
    }
}
