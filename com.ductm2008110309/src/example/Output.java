package example;
public abstract class Output {

    public Output() {
    }

    protected double area = 0;

    public void console() {
        System.out.println("Total area" + area);
    }

    public void HTML() {
        System.out.println("<HTML>");
        System.out.println("<Total area all" + area);
    }
}
