package com.net4w.observer;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final CurrentCondition currentCondition = new CurrentCondition();
        final WeatherData weatherData = new WeatherData(currentCondition);
        weatherData.setData(30, 150, 40);
    }
}
