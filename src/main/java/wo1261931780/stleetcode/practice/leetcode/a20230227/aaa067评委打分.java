package wo1261931780.stleetcode.practice.leetcode.a20230227;

import java.util.Scanner;

public class aaa067评委打分 {
    // public static void main(String[] args) {
    //     Random xx = new Random();
    //     int[] arr = new int[6];
    //     int x = 0;
    //     for (System.out.println("start"); x < arr.length; x++) {
    //         arr[x] = xx.nextInt(100);
    //         System.out.println("第" + x + "位评委给出的得分是：" + arr[x]);
    //     }
    //     //        int max=0;
    //     mm(arr, x);
    //     //        System.out.println("最大值是：");
    //     //下面是官方的方法-------------------------
    //     //下面是官方的方法-------------------------
    //     //下面是官方的方法-------------------------
    //     /*这里是输入具体分数，计算平均分的方法，但是遍历思想是相同的
    //     Scanner zz=new Scanner(System.in);
    //     int z1=zz.nextInt();
    //     for (int z=0;z< arr.length;z++){
    //         System.out.println("第"+(z+1)+"个评委的分数是：");//括号里面可以跟对象，但是不能跟代码/命令。
    //         arr[z]=zz.nextInt();
    //     }*/
    // }
    //
    // public static void mm(int[] arr, int x) {
    //     int mn = 0;
    //     //这里定义没有问题，如果结果max=0，说明是遍历开始的时候，x就是不正确的数据，导致根本没有进行遍历。
    //     //需要对x进行一次定义。
    //     x = 0;
    //     int max = arr[x];
    //     int min = arr[x];
    //     for (System.out.println("开始对比"); x < arr.length; x++) {
    //         if (max < arr[x]) {
    //             max = arr[x];
    //             mn += arr[x];
    //         } else if (min > arr[x]) {
    //             min = arr[x];
    //             mn += arr[x];
    //         } else {
    //             mn += arr[x];
    //         }
    //     }
    //     mn = mn - max - min;
    //     System.out.println("遍历结束,最大值为：" + max + ".遍历结束,最小值为：" + min);
    //     //System.out.println("选手得分：" + mn/4);
    //     //这里改成arr.length-2比较科学
    //     System.out.println("选手得分是：" + mn / (arr.length - 2));
    // }
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        int[] score1 = new int[6];
        demoimp(score1);
        demosc(score1);
    }

    public static void demoimp(int[] score1) {
        System.out.println("开始输入数据：");
        Scanner x1 = new Scanner(System.in);
        for (int i = 0; i < score1.length; i++) {
            System.out.println("输入第" + i + "个分数:");
            int c = x1.nextInt();
            score1[i] = c;
        }
        System.out.println("打分结束");
        // System.out.println("输入第一个分数：");
        // int c1 = x1.nextInt();
        // score1[1] = c1;
        // System.out.println("输入第二个分数：");
        // int c2 = x1.nextInt();
        // System.out.println("输入第三个分数：");
        // int c3 = x1.nextInt();
        // System.out.println("输入第四个分数：");
        // int c4 = x1.nextInt();
        // System.out.println("输入第五个分数：");
        // int c5 = x1.nextInt();
        // System.out.println("输入第六个分数：");
        // int c6 = x1.nextInt();
    }

    public static void demosc(int[] score1) {
        int max = score1[0];
        int min = score1[0];
        int x = 0;
        for (int i = 0; i < score1.length; i++) {
            if (score1[i] > max) {
                max = score1[i];
            } else if (score1[i] < min) {
                min = score1[i];
            }
            x += score1[i];
        }
        x = (x - max - min) / (score1.length - 2);
        System.out.println("平均分为：" + x);
    }
}
