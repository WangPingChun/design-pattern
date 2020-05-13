package com.net4w.flyweight;

/**
 * @author WangPingChun
 */
public class ConcreteWebSite extends WebSite {
    /**
     * 网站发布形式（共享的部分）
     */
    private final String type;

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + ", 使用者是：" + user.getName());
    }
}
