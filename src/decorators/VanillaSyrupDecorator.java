package decorators;

import beverages.IBeverage;

public class VanillaSyrupDecorator extends BeverageDecorator {
    public VanillaSyrupDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", VanillaSyrup";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
