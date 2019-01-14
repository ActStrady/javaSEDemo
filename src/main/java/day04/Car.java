package day04;

/**
 * * 5. 创建一个汽车类 Car，为其定义两个属性：颜色和型号。
 *  *    为该类创建两个构造方法： 第一个为无形参的构造方法，利用其中方法将颜色和型号设置为红色、轿车。
 *  *    第二个为带参构造方法，利用构造方法将颜色和型号设置为黑色、轿车.
 *  *    另外为该类创建两个方法，分别用来显示颜色和型号。
 *  *    在一个测试类里调用
 */
public class Car {
    private String color;
    private String model;

    public Car() {
        this.color = "红色";
        this.model = "轿车";

    }

    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
