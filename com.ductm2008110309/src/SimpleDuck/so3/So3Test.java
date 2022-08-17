package SimpleDuck.so3;

public class So3Test {
    private static final Quack QuackBehivior = null;
    private static final FlywithWings FlyButter = null;

    public static void main(String[] args) {
        // Duck duck = new MallarDuck();
        // duck.swim();
        // duck.quack();
        // duck = new ReadheadDuck();
        // duck.swim();
        // duck.quack();
        MallarDuck mDuck = new MallarDuck(FlyButter, QuackBehivior);
        ReadheadDuck rDuck = new ReadheadDuck(QuackBehivior, FlyButter);
        DecoyDuck decoyDuck2 = new DecoyDuck();
        mDuck.perfromQuack();
        rDuck.perfromQuack();
        decoyDuck2.perfromQuack();
        mDuck.performFly();
        decoyDuck2.performFly();
    }
}
