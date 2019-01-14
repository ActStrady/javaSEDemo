import day02.Contral;
import day04.Car;
import day04.Date;
import day04.Stochastic;
import day04.Student;

import javax.sound.midi.Soundbank;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Contral contral = new Contral();
        // System.out.println("101到200的素数有：");
        // contral.getPrime();
        // System.out.println("水仙花数有：");
        // contral.narcissus();
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("请输入两个数字");
        // int n = scanner.nextInt();
        // int m = scanner.nextInt();
        // System.out.println(n + "和" + m + "的最大公约数是：" + contral.gcd(n, m));
        // System.out.println("最小公倍数是：" + contral.lcm(n, m));

        Student student = new Student();
        student.setName("张三疯");
        student.setsId(201802556);
        student.setScore(100);
        System.out.println(student.getName());
        System.out.println(student.getsId());
        System.out.println(student.getScore());
        System.out.println(student);

        Car car = new Car();
        System.out.println(car);
        Car car2 = new Car("黑色", "轿车");
        System.out.println(car2);

        Date date = new Date(2018, 1, 20);
        System.out.println(date.format());
        int dayForYear = date.getDayForYear(2018, 1, 1);
        System.out.println("这一天是今年的第" + dayForYear + "天");

        new Stochastic().call_over();

    }
}
