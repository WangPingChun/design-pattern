package com.net4w.flyweight;

import java.util.HashMap;

/**
 * 网站工厂类.
 *
 * @author WangPingChun
 */
public class WebSiteFactory {
    private final HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    public WebSite getWebSite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
