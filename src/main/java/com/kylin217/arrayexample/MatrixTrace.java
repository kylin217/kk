package com.kylin217.arrayexample;

/**
 * @author 矩阵的迹：主对角线之和
 */
public class MatrixTrace {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{12, 12, 32, 65, 98}, {78, 69, 36, 25, 14}, {78, 65, 25, 85, 10},
                {89, 56, 23, 12, 45}, {73, 91, 64, 82, 55}};
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
                if (i == j) {
                    sum = sum + arr[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("矩阵的迹为：" + sum);
    }
}
