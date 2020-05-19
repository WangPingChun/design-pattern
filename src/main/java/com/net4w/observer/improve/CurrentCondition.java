package com.net4w.observer.improve;

import lombok.extern.slf4j.Slf4j;

/**
 * @author WangPingChun
 */
@Slf4j
public class CurrentCondition implements Observer {
    public void display(Weather weather) {
        log.info("Today's temperature: " + weather.getTemperature());
        log.info("Today's pressure: " + weather.getPressure());
        log.info("Today's humidity: " + weather.getHumidity());
    }

    @Override
    public void update(Weather weather) {
        display(weather);
    }
}
