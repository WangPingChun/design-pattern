package com.net4w.observer.improve;

import lombok.extern.slf4j.Slf4j;

/**
 * @author WangPingChun
 */
@Slf4j
public class Baidu implements Observer {
    @Override
    public void update(Weather weather) {
        log.info("百度 [天气 = {}, 气压 = {}, 湿度 = {}]", weather.getTemperature(), weather.getPressure(), weather.getHumidity());
    }
}
