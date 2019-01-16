package day05;

/**
 * 字符串常用方法和构造
 */
public class Str {
    public static void main(String[] args) {
        // 构造
        String string1 = new String();

        char[] sc = {'X', 'M', 'N'};
        String jack = new String(sc);

        byte[] bytes = "RTOM".getBytes();
        String s = new String(bytes);

        String s1 = new String("timoming");

        System.out.println(string1 + " "+ jack + " " + s + " " + s1);

        // 常用方法
        // 索引取字符
        char c = s1.charAt(0);
        System.out.println(c);

        // 索引取unicode字符对应的数
        int i1 = s1.codePointAt(1);
        System.out.println(i1);

        // 索引之前的unicode字符对应的数
        int i2 = s1.codePointBefore(3);
        System.out.println(i2);

        // 指定区间的unicode字符对应的数
        int i3 = s1.codePointCount(0, 3);
        System.out.println(i3);

        int i4 = Integer.parseInt("123");
        int integer = Integer.valueOf("1234");

        System.out.println(i4);
        System.out.println(integer);

        double v = Double.parseDouble("1.255");
        double valueOf = Double.valueOf("1.25");
        System.out.println(v);
        System.out.println(valueOf);
        int i = s1.indexOf("m");
        System.out.println(i);



    }
}
