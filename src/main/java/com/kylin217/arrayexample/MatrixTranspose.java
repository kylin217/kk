package com.kylin217.arrayexample;

/**
 * @author 矩阵转置
 */
public class MatrixTranspose {

    public static void main(String[] args) {
        // 创建二维数组
        int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int arrLength = arr.length;
        System.out.println("转置前的矩阵：");
        // 输出二维数组
        printArray(arr);
        int[][] arr2 = new int[arrLength][arrLength];
        // 调整数组行列数据
        for (int i = 0; i < arrLength; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        System.out.println("转置后的矩阵：");
        // 输出行列互调后的二维数组
        printArray(arr2);
    }

    /**
     * 遍历数组并输出数组的全部元素
     */
    private static void printArray(int[][] arr) {
        // 遍历数组
        for (int[] ints : arr) {
            for (int j = 0; j < arr.length; j++) {
                // 不换行输出数组元素
                System.out.print(ints[j] + " ");
            }
            System.out.println();    //换行
        }
    }
}
