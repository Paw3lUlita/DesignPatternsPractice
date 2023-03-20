package pl.ulita.observer_pattern.observers;

import pl.ulita.observer_pattern.observable.WeatherForecast;

public class RadioNews implements Observer{
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("Radio - new forecast: " +
                "temp: " + forecast.getTemperature() +
                ", pressure: " + forecast.getPressure());
    }
}
