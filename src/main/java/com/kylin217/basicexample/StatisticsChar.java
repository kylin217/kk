package com.kylin217.basicexample;

/**
 * @author 统计一个字符串中的各种字符个数
 */
public class StatisticsChar {

    public static void main(String[] args)   {
        String zifuchuan = "d88k...,l收到JFK四大皆空";
        int hanzishu = 0;
        int zimu = 0;
        int kongge = 0;
        int shuzi = 0;
        int qita = 0;
        byte[] bytes = zifuchuan.getBytes();
        for (byte aByte : bytes) {
            if ((aByte >= 65 && aByte <= 90) || (aByte >= 97 && aByte <= 122)) {
                zimu++;
            } else if (aByte == 32) {
                kongge++;
            } else if (aByte >= 48 && aByte <= 57) {
                shuzi++;
            } else if (aByte < 0) {
                hanzishu++;
            } else {
                qita++;
            }
        }
        System.out.printf("个数==>字符串:%s,汉字:%s,字母:%s,空格:%s,数字:%s,其他:%s%n", bytes.length, hanzishu / 2, zimu, kongge, shuzi, qita);
    }
}
