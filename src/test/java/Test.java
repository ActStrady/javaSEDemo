import day02.Contral;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Contral contral = new Contral();
        System.out.println("101到200的素数有：");
        contral.getPrime();
        System.out.println("水仙花数有：");
        contral.narcissus();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个数字");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(n + "和" + m + "的最大公约数是：" + contral.gcd(n, m));
        System.out.println("最小公倍数是：" + contral.lcm(n, m));
    }
}
