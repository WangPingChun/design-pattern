package com.net4w.observer.improve;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author WangPingChun
 */
@Data
@AllArgsConstructor
public class Weather {
    private float temperature;
    private float pressure;
    private float humidity;
}
