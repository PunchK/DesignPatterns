package ObjectDuck;

import FatherClass.Duck;

public class BlueDuck extends Duck {
    @Override
    public void svim() {
        System.out.println("I was sick,I need to have a rest");
    }

    @Override
    public void display() {
        System.out.println("\nIm not red.Im blue.");
    }

}
