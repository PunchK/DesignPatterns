package ObserveAndObjectInterface;

public interface ObjectInterface {
    public void registerObserver(ObserveInterface o);

    public void removeObserver(ObserveInterface o);

    public void notifyObserver();
}
