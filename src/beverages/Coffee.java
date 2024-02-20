package beverages;

public class Coffee implements IBeverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 20.0;
    }
}
