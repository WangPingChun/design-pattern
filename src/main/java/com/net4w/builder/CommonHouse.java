package com.net4w.builder;

/**
 * @author WangPingChun
 */
public class CommonHouse extends AbstractHouse {
    @Override
    protected void buildBasic() {
        System.out.println("给普通房子打地基");
    }

    @Override
    protected void buildWall() {
        System.out.println("给普通房子砌墙");
    }

    @Override
    protected void roofed() {
        System.out.println("给普通房子盖屋顶");
    }
}
