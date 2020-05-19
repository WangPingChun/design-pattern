package com.net4w.observer;

import lombok.Getter;

/**
 * @author WangPingChun
 */
@Getter
public class WeatherData {
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentCondition currentCondition;

    public WeatherData(CurrentCondition currentCondition) {
        this.currentCondition = currentCondition;
    }

    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    public void dataChange() {
        currentCondition.update(getTemperature(), getPressure(), getHumidity());
    }
}
