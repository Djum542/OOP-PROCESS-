package so2;

import SimpleDuck.v2.RubberDuck;

public class So2Test {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        duck.fly();
        duck.deslay();
        duck.quack();
        RedheadDuck rDuck = new RedheadDuck();
        rDuck.deslay();
        rDuck.fly();
        rDuck.quack();
        RubberDuck rDuck2 = new RubberDuck();
        rDuck2.delay();
        rDuck2.quack();
    }
}
