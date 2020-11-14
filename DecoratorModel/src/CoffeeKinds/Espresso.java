package CoffeeKinds;

import CoffeeGod.CoffeeGodMom;

public class Espresso extends CoffeeGodMom {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.66;
    }
}
