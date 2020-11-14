package DecoratorsOfCoffee;

import CoffeeGod.CoffeeDrinkingGod;
import CoffeeGod.CoffeeGodMom;

public class Mocha extends CoffeeDrinkingGod {
    CoffeeGodMom coffeeGodMom;

    public Mocha (CoffeeGodMom coffeeGodMom) {
        this.coffeeGodMom = coffeeGodMom;
    }

    public String getDescription() {
        return coffeeGodMom.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .30 + coffeeGodMom.cost();
    }
}
