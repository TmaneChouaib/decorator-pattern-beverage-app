import beverages.Coffee;
import beverages.IBeverage;
import beverages.Milk;
import decorators.*;

public class Main {
    public static void main(String[] args) {

        IBeverage coffeeBeverage = new Coffee();
        IBeverage milkBeverage = new Milk();

        IBeverage coffeeCaramel = new CaramelDecorator(coffeeBeverage);
        IBeverage coffeeWithCaramelAndCream = new WipedCreamDecorator(coffeeCaramel);
        IBeverage coffeeWithCaramelAndChoco = new ChocolateDecorator(coffeeCaramel);
        IBeverage coffeeVanilla = new VanillaSyrupDecorator(coffeeBeverage);
        IBeverage coffeeVanillaWithSugar = new SugarDecorator(coffeeVanilla);
        IBeverage milkWithSugar = new SugarDecorator(milkBeverage);
        IBeverage milkWithSugarX2 = new SugarDecorator(milkWithSugar);

        System.out.println("\n");

        System.out.println("coffeeCaramel served with : \n" + "-> " +coffeeCaramel.getDescription() + "\n - Cost: " + coffeeCaramel.cost() + " DH \n\n");
        System.out.println("coffeeWithCaramelAndCream served with : \n" + "-> "+ coffeeWithCaramelAndCream.getDescription() + "\n - Cost: " + coffeeWithCaramelAndCream.cost() + " DH \n\n");
        System.out.println("coffeeWithCaramelAndChoco served with : \n" + "-> "+ coffeeWithCaramelAndChoco.getDescription() + "\n - Cost: " + coffeeWithCaramelAndChoco.cost() + " DH \n\n");
        System.out.println("coffeeVanilla served with : \n" + "-> "+ coffeeVanilla.getDescription() + "\n - Cost: " + coffeeVanilla.cost() + " DH \n\n");
        System.out.println("coffeeVanillaWithSugar served with : \n" + "-> "+ coffeeVanillaWithSugar.getDescription() + "\n - Cost: " + coffeeVanillaWithSugar.cost() + " DH \n\n");
        System.out.println("milkWithSugar served with : \n" + "-> "+ milkWithSugar.getDescription() + "\n - Cost: " + milkWithSugar.cost() + " DH \n\n");
        System.out.println("milkWithSugarX2 served with : \n" + "-> "+ milkWithSugarX2.getDescription() + "\n - Cost: " + milkWithSugarX2.cost() + " DH \n\n");

    }
}