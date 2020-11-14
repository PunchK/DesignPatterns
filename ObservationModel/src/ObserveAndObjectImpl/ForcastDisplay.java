package ObserveAndObjectImpl;

import ObserveAndObjectInterface.DisplayElement;
import ObserveAndObjectInterface.ObjectInterface;
import ObserveAndObjectInterface.ObserveInterface;

public class ForcastDisplay implements ObserveInterface, DisplayElement {

    private ObjectInterface WeatherData;
    private float pressure;

    public ForcastDisplay(ObjectInterface WeatherData){
        this.WeatherData = WeatherData;
        WeatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("pressure is " + pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}
