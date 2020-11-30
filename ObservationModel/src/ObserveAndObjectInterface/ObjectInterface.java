package ObserveAndObjectInterface;

public interface ObjectInterface {
    void registerObserver(ObserveInterface o);

    void removeObserver(ObserveInterface o);

    void notifyObserver();
}
