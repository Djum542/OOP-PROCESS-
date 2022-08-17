package example;
public abstract class Square extends Shape {
    private double side;

    public Square(double s, double s2, double side) {
        super(s, s2);
        this.side = side;
    }

    public double calcArea() {
        double area = side * side;
        return area;
    }
}
