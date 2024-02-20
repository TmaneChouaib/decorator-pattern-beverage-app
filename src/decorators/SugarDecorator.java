package decorators;

import beverages.IBeverage;

public class SugarDecorator extends BeverageDecorator {

    public SugarDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Sugar";
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }
}
