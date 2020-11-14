package ObserveAndObjectImpl;

import ObserveAndObjectInterface.DisplayElement;
import ObserveAndObjectInterface.ObjectInterface;
import ObserveAndObjectInterface.ObserveInterface;

public class ObserveImplement implements ObserveInterface, DisplayElement {

    private float temperature;
    private float humidity;
    private ObjectInterface WeatherData;

    public ObserveImplement(ObjectInterface WeatherData){
        this.WeatherData = WeatherData;
        WeatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity );
    }
}
