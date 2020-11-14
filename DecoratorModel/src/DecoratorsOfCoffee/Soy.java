package DecoratorsOfCoffee;

import CoffeeGod.CoffeeDrinkingGod;
import CoffeeGod.CoffeeGodMom;

public class Soy extends CoffeeDrinkingGod {
    CoffeeGodMom coffeeGodMom;

    public Soy (CoffeeGodMom coffeeGodMom) {
        this.coffeeGodMom = coffeeGodMom;
    }

    public String getDescription() {
        return coffeeGodMom.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .50 + coffeeGodMom.cost();
    }
}
