package com.net4w.interpreter;

import java.util.Map;

/**
 * @author WangPingChun
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
