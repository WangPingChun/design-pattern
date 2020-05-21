package com.net4w.interpreter;

import java.util.Map;

/**
 * 抽象表达式类.
 *
 * @author WangPingChun
 */
public abstract class Expression {
    /**
     * 解析公式和数值.
     *
     * @param var 其中var中的key值是公式中的参数,value值是具体的数字
     * @return 结果
     */
    public abstract int interpreter(Map<String, Integer> var);
}
