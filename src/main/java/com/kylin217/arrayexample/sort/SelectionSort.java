package com.kylin217.arrayexample.sort;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author 数组选择排序法
 */
public class SelectionSort {

    public static void main(String[] args){
        int[] arrays = new int[]{1, 5, 2, 4, 9, 36, 67, 7, 8, 3};
        int arraysLength = arrays.length;
        int[] desc = arrays.clone() , esc = arrays.clone();
        for (int i = 0; i < arraysLength; i++) {
            for (int j = i + 1; j < arraysLength; j++) {
                if (desc[i] < desc[j]) {
                    int tem = desc[i];
                    desc[i] = desc[j];
                    desc[j] = tem;
                }

                if(esc[i] > esc[j]){
                    int tem = esc[i];
                    esc[i] = esc[j];
                    esc[j] = tem;
                }
            }
        }
        String stringNull = ",";
        System.out.println(ArrayUtils.toString(arrays, stringNull));
        System.out.println(ArrayUtils.toString(desc, stringNull));
        System.out.println(ArrayUtils.toString(esc, stringNull));
    }
}
