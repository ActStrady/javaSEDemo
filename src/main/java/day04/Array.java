package day04;

public class Array {
    public static void main(String[] args) {
        Object[] obj = new Object[8];
        obj[0] = 11;
        obj[1] = "背景";
        obj[2] = 'c';
        obj[3] = false;
        for (Object o : obj) {
            System.out.println(o);
        }
    }
}
