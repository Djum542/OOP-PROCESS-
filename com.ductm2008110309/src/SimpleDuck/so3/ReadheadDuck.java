package SimpleDuck.so3;

public class ReadheadDuck extends Duck {

    @Override
    public void dislay() {
        // TODO Auto-generated method stub

    }

    public ReadheadDuck(Quack QuackBehivior, FlywithWings FlyButter) {
        QuackBehivior = new Quack();
        FlyButter = new FlywithWings();
    }

}
