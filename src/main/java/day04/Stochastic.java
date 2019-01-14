package day04;

import java.util.Random;
import java.util.Scanner;

/**
 * 两种生成随机数的方法的比较
 * 结果是Math的随机函数效率更好一些
 */
public class Stochastic {

    public int mathRandom(int start, int num) {
        return (int) (Math.random() * num) + start;
    }

    public int classRandom(int start, int num) {
        Random random = new Random();
        return random.nextInt(num) + start;
    }

    // 随机点名方法
    public void call_over() {
        String[] name = {"陈月芳", "刘立超", "邓超元", "赵明睿", "赵晨锦", "金谡",
                "杨斌", "杨恒", "李静雅", "王雅雯", "王强", "师尧", "吴凯平",
                "韩思远", "陈慧慧", "李欣", "王一茗", "李奕霖", "苏宏月", "赵灿"};
        while (true) {
            System.out.println("按回车点名，输入quit退出");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.nextLine();
            if (next.equals("quit")) {
                System.exit(2);
            } else {
                int random = mathRandom(0, 20);
                System.out.println(name[random]);
            }
        }
    }

    // public static void main(String[] args) {
    //     // 通过随机类
    //     final long startTime1 = System.currentTimeMillis();
    //     Random random = new Random();
    //     for (int i = 0; i < 10000; i++) {
    //         int anInt = random.nextInt(20);
    //         System.out.print(anInt + 1 + " ");
    //     }
    //     System.out.println();
    //     final long endTime1 = System.currentTimeMillis();
    //     System.out.println("使用随机类" + (endTime1 - startTime1));
    //
    //     // 通过Math的随机函数
    //     final long startTime2 = System.currentTimeMillis();
    //     for (int i = 0; i < 10000; i++) {
    //         System.out.print((int) (Math.random() * 20) + 1 + " ");
    //     }
    //     System.out.println();
    //     final long endTime2 = System.currentTimeMillis();
    //     System.out.println("使用Math的随机方法" + (endTime2 - startTime2));
    //
    // }
}
