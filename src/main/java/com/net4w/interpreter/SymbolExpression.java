package com.net4w.interpreter;

import lombok.AllArgsConstructor;

/**
 * 抽象运算符号解析器.
 *
 * @author WangPingChun
 */
@AllArgsConstructor
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
}
