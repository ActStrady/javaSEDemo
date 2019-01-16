package day05;

public interface Shape {
    double getArea();

    double getPerimeter();
}

class Square implements Shape {
    double length;

    public Square() {
    }

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
