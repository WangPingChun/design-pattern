package com.net4w.interpreter;

import com.google.common.primitives.Chars;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author WangPingChun
 */
public class Client {
    public static void main(String[] args) throws IOException {
        final String expStr = getExpStr();
        final Map<String, Integer> var = getValue(expStr);
        Caculator caculator = new Caculator(expStr);
        System.out.println("运算结果为:" + expStr + "=" + caculator.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.println("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> result = new HashMap<>(16);

        // 解析有几个参数要传递
        for (char c : expStr.toCharArray()) {
            if (c != '+' && c != '-' && c != ' ') {
                // 解决重复参数的问题
                if (!result.containsKey(String.valueOf(c))) {
                    System.out.print(String.format("请输入%s的值:", c));
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    result.put(String.valueOf(c), Integer.valueOf(in));
                }
            }
        }

        return result;
    }
}
