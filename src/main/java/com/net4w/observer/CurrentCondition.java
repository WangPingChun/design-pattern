package com.net4w.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author WangPingChun
 */
@Slf4j
public class CurrentCondition {
    private float temperature;
    private float pressure;
    private float humidity;

    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        log.info("Today's temperature: " + temperature);
        log.info("Today's pressure: " + pressure);
        log.info("Today's humidity: " + humidity);
    }
}
