package decorators;

import beverages.IBeverage;

public class CaramelDecorator extends BeverageDecorator {

    public CaramelDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Caramel";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
