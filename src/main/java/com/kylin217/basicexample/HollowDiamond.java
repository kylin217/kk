package com.kylin217.basicexample;

/**
 * @author 空心菱
 */
public class HollowDiamond {

    public static void main(String[] args) {
        printHollowRhombus(7);
    }

    public static void printHollowRhombus(int size) {
        if (size % 2 == 0) {
            size++;// 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                // 输出左上角位置的空白
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i) {
                    // 输出菱形上半部边缘
                    System.out.print("* ");
                } else {
                    // 输出菱形上半部空心
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                // 输出菱形左下角空白
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                if (j == 0 || j == 2 * (size - i - 1)) {
                    // 输出菱形下半部边缘
                    System.out.print("* ");
                } else {
                    // 输出菱形下半部空心
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
