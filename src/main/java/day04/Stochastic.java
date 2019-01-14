package day04;

import java.util.Random;

/**
 * 两种生成随机数的方法的比较
 * 结果是Math的随机函数效率更好一些
 */
public class Stochastic {

    protected int nam;
    void vn(){}
    public static void main(String[] args) {
        // 通过随机类
        final long startTime1 = System.currentTimeMillis();
        Random random = new Random();
        for (int i
             = 0; i < 10000; i++) {
            int anInt = random.nextInt(20);
            System.out.print(anInt + 1 +  " ");
        }
        System.out.println();
        final long endTime1 = System.currentTimeMillis();
        System.out.println("使用随机类" + (endTime1 - startTime1));

        // 通过Math的随机函数
        final long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.print((int)(Math.random() * 20) + 1 +  " ");
        }
        System.out.println();
        final long endTime2 = System.currentTimeMillis();
        System.out.println("使用Math的随机方法" + (endTime2 - startTime2));
    }
}
