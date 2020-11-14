package ImplementDuckBehavior;

import InterfaceDuckBehavior.FlyBehavior;

public class FlyRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("im flying like a rocket!");
    }
}
