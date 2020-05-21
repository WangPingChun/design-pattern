package com.net4w.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

/**
 * 变量解析器.
 *
 * @author WangPingChun
 */
@AllArgsConstructor
public class VarExpression extends Expression {
    private final String key;

    @Override
    public int interpreter(Map<String, Integer> var) {
        // 从Map中取值
        return var.get(this.key);
    }
}
