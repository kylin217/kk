package com.kylin217.basicexample;

import java.math.BigDecimal;

/**
 * @author 1+1／2!+1／3!···1／10!的计算结果
 */
public class Factorial {

    public static void main(String[] args) {
        BigDecimal sum = BigDecimal.ZERO;
        // 阶乘项的计算结果
        BigDecimal factorial = BigDecimal.ONE;
        // 循环增量
        int i = 1;
        int orderCode = 10;
        while (i <= orderCode) {
            // 累加各项阶乘的和
            sum = sum.add(factorial);
            ++i;
            factorial = factorial.multiply(new BigDecimal(1.0 / i));
        }
        System.out.println("1+1／2!+1／3!···1／10!的计算结果等于：\n" + sum);
    }

}
