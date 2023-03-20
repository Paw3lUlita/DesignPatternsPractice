package pl.ulita.observer_pattern.observers;

import pl.ulita.observer_pattern.observable.WeatherForecast;

public class InternetNews implements Observer{
    @Override
    public void update(WeatherForecast forecast) {
        System.out.println("Internet - new forecast: " +
              "temp: " + forecast.getTemperature() +
                ", pressure: " + forecast.getPressure());
    }
}
