package bg.tu_varna.sit.a1.f21621575.Pizza;

import bg.tu_varna.sit.a1.f21621575.DecorateDish;
import bg.tu_varna.sit.a1.f21621575.Dish;
import bg.tu_varna.sit.a1.f21621575.Menu;

public class Pizza extends Menu implements DecorateDish {
    public Pizza(Dish d){
        super(d);
    }
    @Override
    public String decorateDish() {
    return "Pizza";
    }
    @Override
    public void makeADish() {
        dish.makeADish();
    }
}
