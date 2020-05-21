package com.net4w.interpreter;

import java.util.Map;

/**
 * @author WangPingChun
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
