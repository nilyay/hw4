package bg.tu_varna.sit.a1.f21621575.Decorator;

import bg.tu_varna.sit.a1.f21621575.DecorateDish;

public abstract class BaseDecorator implements DecorateDish {
    private DecorateDish dish;
    public BaseDecorator(DecorateDish dish){
        this.dish = dish;
    }
    @Override
    public String decorateDish() {
        return dish.decorateDish();
    }
}
