package JavaAPIObserver;

import ObserveAndObjectInterface.DisplayElement;
import ObserveAndObjectInterface.ObserveInterface;

import java.util.Observable;
import java.util.Observer;

public class ConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public ConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\n");
        System.out.println("Current conditions:" + temperature + "degrees is " + humidity );
    }

    @Override
    public void update(Observable obs, Object arg) {

        if(obs instanceof WeatherDataUseObserver){
            WeatherDataUseObserver weatherDataUseObserver = (WeatherDataUseObserver)obs;
            this.temperature = weatherDataUseObserver.getTemperature();
            this.humidity = weatherDataUseObserver.getHumidity();
            display();
        }
    }
}
