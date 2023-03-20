package pl.ulita.observer_pattern.observers;

import pl.ulita.observer_pattern.observable.WeatherForecast;

public class TvNews implements Observer{
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("Tv - new forecast: " +
                "temp: " + forecast.getTemperature() +
                ", pressure: " + forecast.getPressure());
    }
}
