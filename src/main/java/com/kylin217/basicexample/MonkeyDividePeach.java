package com.kylin217.basicexample;

/**
 * @author 猴子分桃： 有5只猴子在海边发现一堆桃子，商定第二天来分：
 *                  第1只猴子平均分五分，多一只 ==》就朝海里扔了一只，拿上自己的一份走了。
 *                  第2，3，4，5只猴子也遇到同样的问题，采用了同样的方法，都是扔掉一只后，恰好可以分成5份。
 *                  问这堆桃子至少有多少只？
 */
public class MonkeyDividePeach {

    public static void main(String[] args) {
        int n = 1, m = 0 , flag = 1;
        //猴子数量
        int monkeyNum = 5;
        while (flag < monkeyNum) {
            flag = 1;
            m = monkeyNum * n + 1;
            for (int i = monkeyNum; i >= 1; i--) {
                if (m % (monkeyNum - 1) == 0) {
                    m = m / (monkeyNum - 1) * monkeyNum + 1;
                    //计算多少次的桃子数量被4整除
                    flag++;
                } else {
                    break;
                }
            }
            //每次的桃子数量都能被4整除
            n++;
        }
        System.out.println("开始的桃子数至少是：" + m);
        System.out.println("此时第五个猴子得到的桃子数是：" + n);
    }
}
