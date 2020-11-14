package ImplementDuckBehavior;

import InterfaceDuckBehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
