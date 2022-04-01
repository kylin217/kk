package com.kylin217.basicexample;

import java.util.Scanner;

/**
 * @author 81279
 */
public class Constant {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);


        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);


        //此例只是为了证明低类型向高类型自动转换
        Byte b = 50;
        char c = 'G';
        short s = 12345;
        int i = 6789;
        long l = 10000L;
        float f = 3.14159F;
        double d = 3.1415926;

        System.out.println(b);
        System.out.println(b + c);
        System.out.println(b + c + s);
        System.out.println(b + c + s + i);
        System.out.println(b + c + s + i + l);
        System.out.println(b + c + s + i + l + f);
        System.out.println(b + c + s + i + l + f + d);


        //不借助第三者实现两个变量值的互换
        long ascan = 4 ;
        long bscan = 6 ;
        ascan = ascan ^ bscan;
        bscan = bscan ^ ascan;
        ascan = ascan ^ bscan;
        System.out.println(ascan + " ::::: " + bscan);

        //获取字符串的哈希码
        System.out.println("ddddd".hashCode());


    }

}
