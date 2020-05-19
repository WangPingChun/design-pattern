package com.net4w.observer.improve;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        weatherData.attachObserver(new CurrentCondition());
        weatherData.attachObserver(new Baidu());

        Weather weather = new Weather(35, 123, 12);
        weatherData.setWeather(weather);

        weatherData.notifyObserver();
    }
}
