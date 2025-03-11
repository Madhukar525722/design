package decoratorDesign;

import decoratorDesign.BasePizza;

public class BasePizzaImpl extends BasePizza {
    @Override
    public int cost(){
        return 100;
    }
}