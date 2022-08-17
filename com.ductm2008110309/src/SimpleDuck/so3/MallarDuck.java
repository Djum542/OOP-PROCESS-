package SimpleDuck.so3;

import so2.Flyable;
import so2.Quackable;

public class MallarDuck extends Duck {

    @Override
    public void dislay() {
        // TODO Auto-generated method stub

    }

    public MallarDuck(FlywithWings FlyButter, Quack QuackBehivior) {
        FlyButter = new FlywithWings();
        QuackBehivior = new Quack();
    }

}
