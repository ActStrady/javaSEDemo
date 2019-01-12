package day03;

/**
 *
 * 扑克类，提供了创建扑克的方法
 * @author actstrady
 */
public class Poker {
    private String color;
    private String num;

    public Poker(String color, String num) {
        this.color = color;
        this.num = num;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Poker{" +
                "color='" + color + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    // 创建扑克
    public String createPoker() {
        return color + num;
    }
}
