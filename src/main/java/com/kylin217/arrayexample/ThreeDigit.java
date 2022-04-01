package com.kylin217.arrayexample;

/**
 * @author 1、2、3、4能组成多少个互不相同的三位数
 */
public class ThreeDigit {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int aLength = a.length;
        System.out.print("满足条件的三位数是：");
        for (int i = 0; i < aLength; i++) {
            for (int j = 0; j < aLength; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < aLength; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    for (int h = 0; h < aLength; h++) {
                        if (h == i || h == j || h == k) {
                            continue;
                        }
                        System.out.print(a[j] * 100 + a[k] * 10 + a[h] + " ");
                    }
                }
            }
        }
        System.out.println("");
    }
}
