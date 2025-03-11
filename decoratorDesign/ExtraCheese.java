package decoratorDesign;

import decoratorDesign.BasePizza;

public class ExtraCheese extends ToppingDecorator {

    BasePizza pizza;
    public ExtraCheese(BasePizza pizza){
        this.pizza = pizza;
    }

    public int cost(){
        return this.pizza.cost() + 30;
    }
}