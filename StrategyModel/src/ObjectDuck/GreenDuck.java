package ObjectDuck;

import FatherClass.Duck;
import ImplementDuckBehavior.FlyWithWings;
import ImplementDuckBehavior.Quack;

public class GreenDuck extends Duck {
    public GreenDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
