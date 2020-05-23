package com.net4w.strategy;

/**
 * 策略枚举.
 *
 * @author WangPingChun
 */
public enum Calculator {
    /**
     * 加法运算.
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * 减法运算.
     */
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private final String value;

    Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
