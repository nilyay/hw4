package bg.tu_varna.sit.a1.f21621575.Pizza;

import bg.tu_varna.sit.a1.f21621575.Decorator.BaseDecorator;
import bg.tu_varna.sit.a1.f21621575.Dish;

public class PepperoniPizza implements Dish {
    public PepperoniPizza(BaseDecorator decorator) {

    }
    @Override
    public void makeADish() {
        System.out.println("Pepperoni pizza");
    }
}
