package beverages;

public class Milk implements IBeverage{
    @Override
    public String getDescription() {
        return "Milk";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
