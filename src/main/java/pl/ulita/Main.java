package pl.ulita;

import pl.ulita.observer_pattern.observable.WeatherForecast;
import pl.ulita.observer_pattern.observers.InternetNews;
import pl.ulita.observer_pattern.observers.RadioNews;
import pl.ulita.observer_pattern.observers.TvNews;

public class Main {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1003);
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();
        TvNews tvNews = new TvNews();
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);
        weatherForecast.registerObserver(tvNews);
        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(tvNews);
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("New forecast: Only for Internet service");
        weatherForecast.updateForecast(18, 1007);
    }
}