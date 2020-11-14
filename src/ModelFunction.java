import CoffeeGod.CoffeeGodMom;
import CoffeeKinds.Espresso;
import CoffeeKinds.HouseBlend;
import DecoratorsOfCoffee.Mocha;
import DecoratorsOfCoffee.Soy;
import DecoratorsOfCoffee.Whip;
import FatherClass.Duck;
import IODecorator.LowerCaseInputStream;
import ImplementDuckBehavior.FlyWithWings;
import ImplementDuckBehavior.Quack;
import JavaAPIObserver.ConditionsDisplay;
import JavaAPIObserver.WeatherDataUseObserver;
import JframeExample.SwingObserverExample;
import ObjectDuck.BlueDuck;
import ObjectDuck.GreenDuck;
import ObserveAndObjectImpl.ForcastDisplay;
import ObserveAndObjectImpl.ObserveImplement;
import ObserveAndObjectImpl.WeatherData;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ModelFunction {
    /*1.this is the example function of StrategyModel*/
    public void strategyModel(){
        Duck a = new BlueDuck();
        GreenDuck b = new GreenDuck();
        a.setFlyBehavior(new FlyWithWings());
        a.setQuackBehavior(new Quack());
        a.display();
        a.svim();
        a.performFly();
        a.performQuack();
    }

    /*2.this is the example function of ObservationModel*/
    public void observationModel(){
        //without observeAPI
        WeatherData weatherData = new WeatherData();
        ObserveImplement observeImplement = new ObserveImplement(weatherData);
        ForcastDisplay forcastDisplay = new ForcastDisplay(weatherData);
        weatherData.setMeasurements(20, 80, 29.2f);

        //with observeAPI
        WeatherDataUseObserver weatherDataUseObserver = new WeatherDataUseObserver();
        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherDataUseObserver);
        weatherDataUseObserver.setMeaturements(21, 60, 28.3F);

        //JFrame example
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    /*3.this is the example function of DecoratorModel*/
    public void DecoratorModel(){
        //1.myself thoughts
        Mocha mocha = new Mocha(new Espresso());
        System.out.println(mocha.getDescription());
        System.out.println("the price is " + mocha.cost());

        //2.level up
        CoffeeGodMom coffeeGodMom = new Espresso();
        System.out.println(coffeeGodMom.getDescription() + " $" + coffeeGodMom.cost());

        CoffeeGodMom coffeeGodMom1 = new HouseBlend();
        coffeeGodMom1 = new Mocha(coffeeGodMom1);
        coffeeGodMom1 = new Soy(coffeeGodMom1);
        coffeeGodMom1 = new Whip(coffeeGodMom1);
        System.out.println(coffeeGodMom1.getDescription() + " $" + coffeeGodMom1.cost());

        //3.I/O decorator
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("C:\\Users\\11147\\IdeaProjects\\DesignPatterns\\DecoratorModel\\src\\IODecorator\\test.txt")
                            )
                    );
            while ((c = in.read()) > 0){
                System.out.print((char)c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*4.*/

}
