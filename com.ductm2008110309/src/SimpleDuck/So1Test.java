package SimpleDuck;

public class So1Test {
    public static void main(String[] args) {
        Duck duck = new MallarDuck();
        duck.swim();
        duck.quack();
        duck = new ReadheadDuck();
        duck.swim();
        duck.quack();
    }
}
