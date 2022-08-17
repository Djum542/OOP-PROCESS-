package SimpleDuck.so3;

public class DecoyDuck extends Duck {

    @Override
    public void dislay() {
        // TODO Auto-generated method stub

    }

    public DecoyDuck() {
        setQuackBehivior(new MadeQuack());
        setFlyButter(new FlywwithMay());
    }
}
