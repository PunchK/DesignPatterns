package CoffeeKinds;

import CoffeeGod.CoffeeGodMom;

public class HouseBlend extends CoffeeGodMom {
    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 1.66;
    }
}
