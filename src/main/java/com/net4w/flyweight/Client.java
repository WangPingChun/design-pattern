package com.net4w.flyweight;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) {
        final WebSiteFactory webSiteFactory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        final WebSite newsWebSite = webSiteFactory.getWebSite("新闻");
        newsWebSite.use(new User("Tom"));

        // 客户要一个以博客形式发布的网站
        final WebSite blogWebSite1 = webSiteFactory.getWebSite("博客");
        blogWebSite1.use(new User("Jack"));
        // 客户要一个以博客形式发布的网站
        final WebSite blogWebSite2 = webSiteFactory.getWebSite("博客");
        blogWebSite2.use(new User("Rose"));

        System.out.println("网站的分类共 = " + webSiteFactory.getWebSiteCount());
    }
}
