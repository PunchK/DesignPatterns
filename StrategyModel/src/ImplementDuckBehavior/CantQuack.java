package ImplementDuckBehavior;

import InterfaceDuckBehavior.QuackBehavior;

public class CantQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I cant quack!!");
    }
}
