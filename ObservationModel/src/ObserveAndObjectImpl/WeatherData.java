package ObserveAndObjectImpl;

import ObserveAndObjectInterface.ObjectInterface;
import ObserveAndObjectInterface.ObserveInterface;

import java.util.ArrayList;

public class WeatherData implements ObjectInterface {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(ObserveInterface o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ObserveInterface o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            ObserveInterface observer = (ObserveInterface) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged() {
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
