package DecoratorsOfCoffee;

import CoffeeGod.CoffeeDrinkingGod;
import CoffeeGod.CoffeeGodMom;

public class Whip extends CoffeeDrinkingGod {
    CoffeeGodMom coffeeGodMom;

    public Whip (CoffeeGodMom coffeeGodMom) {
        this.coffeeGodMom = coffeeGodMom;
    }

    public String getDescription() {
        return coffeeGodMom.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .90 + coffeeGodMom.cost();
    }
}
