package bg.tu_varna.sit.a1.f21621575.Decorator;

import bg.tu_varna.sit.a1.f21621575.DecorateDish;
import bg.tu_varna.sit.a1.f21621575.Decorator.BaseDecorator;

public class OliveDecorator  extends BaseDecorator {
    public OliveDecorator(DecorateDish dish) {
        super(dish);
    }
    @Override
    public void makeADish() {
        System.out.println("olives");
    }

    @Override
    public String decorateDish() {
        return super.decorateDish() + addOlives();
    }

    public String addOlives(){
        return "olives\n";
    }
}
