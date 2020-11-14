package FatherClass;

import InterfaceDuckBehavior.FlyBehavior;
import InterfaceDuckBehavior.QuackBehavior;

public class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void svim(){
        System.out.println("I svim on the river.");
    }
    public void display(){
        System.out.println("I'm red");
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
