package com.kylin217.basicexample;

/**
 * @author 九九相乘法
 */
public class NineNinePhaseMultiplication {

    public static void main(String[] args) {
        // 循环控制变量从1遍历到9
        int num = 9;
        for (int i = 1; i <= num; i++) {
            // 第二层循环控制变量与第一层最大索引相等
            for (int j = 1; j <= i; j++) {
                // 输出计算结果但不换行
                System.out.print(j + "*" + i + "=" + i * j + "\t");
            }
            // 在外层循环中换行
            System.out.println();
        }
    }

}
