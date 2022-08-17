package example;

public abstract class Circle extends Shape {
    public Circle(double s, double s2) {
        super(s, s2);
        // TODO Auto-generated constructor stub
    }

    private float radiums;

    /**
     * 
     */
    public void Circle() {
        this.radiums = radiums;
    }

    public double clcArea() {
        double area = 3.14 * (radiums * radiums);
        return (area);
    }
}
