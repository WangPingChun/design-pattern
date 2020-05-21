package com.net4w.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author WangPingChun
 */
public class Caculator {
    /**
     * 定义表达式
     */
    private final Expression expression;

    public Caculator(String expStr) {
        // 定义一个栈,安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();

        // 表达式拆分为字符数组
        final char[] chars = expStr.toCharArray();
        Expression left = null;
        Expression right = null;

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+':
                    // 之前的结果
                    left = stack.pop();
                    // 右边的结果,使用'++i'主要是避免了下次的变量公式遍历
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    // 之前的结果
                    left = stack.pop();
                    // 右边的结果,使用'++i'主要是避免了下次的变量公式遍历
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    // 公式中的变量
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }

        this.expression = stack.pop();

    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
