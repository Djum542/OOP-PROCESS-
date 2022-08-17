package example;
public abstract class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double calcArea() {
        double area = length * width;
        return area;
    }
}
