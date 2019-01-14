package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * 两种生成随机数的方法的比较
 * 结果是Math的随机函数效率更好一些
 * 点名方法
 */
public class Stochastic {

    /**
     * 随机获取一个数字， 使用Math的random方法
     *
     * @param start 开始值
     * @param num   个数
     * @return 获取的数字
     */
    public int mathRandom(int start, int num) {
        return (int) (Math.random() * num) + start;
    }

    /**
     * 随机获取一个数字，使用Randomlei
     *
     * @param start 开始值
     * @param num   个数
     * @return 获取的数字
     */
    public int classRandom(int start, int num) {
        Random random = new Random();
        return random.nextInt(num) + start;
    }

    /**
     * 点名
     *
     * @param args 名字数组
     */
    public void call_over(String[] args) {
        while (true) {
            System.out.println("按回车点名，输入quit退出");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if ("quit".equals(next)) {
                System.exit(0);
                scanner.close();
            } else {
                int random = mathRandom(0, 20);
                System.out.println(args[random]);
            }
        }
    }
}
