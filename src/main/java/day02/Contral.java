package day02;

public class Contral {
    /**
     * 打印101-200的素数
     */
    public void getPrime() {
        Boolean flag;
        for (int i = 101; i <= 200; i++) {
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.print(i+"\t");
            }
        }
    }

    /**
     * 三目运算符的嵌套
     *
     * @param score 分数
     */
    public void con(int score) {
        String result = score >= 60 ? (score >= 85 ? "成绩是A" : "成绩是B") : "成绩是C";
        System.out.println(result);
    }

    /**
     * 水仙花数
     */
    public void narcissus() {
        for (int i = 100; i < 1000; i++) {
            int temp = i, post = 0, sum = 0;
            while (temp > 0) {
                post = temp % 10;
                sum += (post * post * post);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i + "\t");
            }
        }
    }

    /**
     * 最大公约数计算，辗转相除，利用递归
     * @param n 第一个数
     * @param m 第二个数
     * @return  最大公约数
     */
    public int gcd(int n, int m) {
        if (m > 0) {
            return gcd(m, n % m);
        } else {
            return n;
        }
    }

    /**
     * 最小公倍数，最小公倍数等于两数相乘除以最大公约数
     * @param n 第一个数
     * @param m 第二个数
     * @return  最小公倍数
     */
    public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}
