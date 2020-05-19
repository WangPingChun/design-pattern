package com.net4w.observer.improve;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author WangPingChun
 */
@Getter
@Setter
public class WeatherData implements Subject {
    /**
     * 观察者集合.
     */
    private List<Observer> observerList = new ArrayList<>();
    private Weather weather;

    @Override
    public void attachObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(this.weather);
        }
    }
}
