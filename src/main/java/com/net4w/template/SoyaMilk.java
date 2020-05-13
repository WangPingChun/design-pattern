package com.net4w.template;

/**
 * @author WangPingChun
 */
public abstract class SoyaMilk {

    /**
     * 模板方法可以做成final，不让子类去覆盖
     */
    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    private void select() {
        System.out.println("第一步：选择好新鲜材料");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    protected abstract void addCondiments();

    private void soak() {
        System.out.println("第三步：材料和配料开始浸泡");
    }

    private void beat() {
        System.out.println("第四步：放到豆浆机去打碎");
    }
}
