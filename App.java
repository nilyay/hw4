package bg.tu_varna.sit.a1.f21621575;
import bg.tu_varna.sit.a1.f21621575.Decorator.OliveDecorator;
import bg.tu_varna.sit.a1.f21621575.Pizza.Pizza;
import bg.tu_varna.sit.a1.f21621575.Pizza.PepperoniPizza;

public class App {
    public static void main(String[] args) {
        DecorateDish decorateDish = new DishImpl();
        DecorateDish firstDish = new Pizza(new PepperoniPizza(new OliveDecorator(decorateDish)));
        firstDish.decorateDish();
        firstDish.makeADish();
    }
}
