package pl.ulita.observer_pattern.observers;

import pl.ulita.observer_pattern.observable.WeatherForecast;

public interface Observer {
    void update(WeatherForecast forecast);
}
