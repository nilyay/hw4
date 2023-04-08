package bg.tu_varna.sit.a1.f21621575;

public abstract class Menu {
    protected Dish dish;
    public Menu(Dish d){
        this.dish = d;
    }
    abstract public void makeADish();
}
