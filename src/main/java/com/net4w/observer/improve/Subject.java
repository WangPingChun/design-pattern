package com.net4w.observer.improve;

/**
 * @author WangPingChun
 */
public interface Subject {
    void attachObserver(Observer observer);

    void detachObserver(Observer observer);

    void notifyObserver();
}
