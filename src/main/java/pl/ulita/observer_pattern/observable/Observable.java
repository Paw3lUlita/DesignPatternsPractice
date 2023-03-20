package pl.ulita.observer_pattern.observable;


import pl.ulita.observer_pattern.observers.Observer;

public interface Observable {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
