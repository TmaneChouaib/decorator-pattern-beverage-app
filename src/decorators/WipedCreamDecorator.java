package decorators;

import beverages.IBeverage;

public class WipedCreamDecorator extends BeverageDecorator {
    public WipedCreamDecorator(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", WipedCream";
    }

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }
}
