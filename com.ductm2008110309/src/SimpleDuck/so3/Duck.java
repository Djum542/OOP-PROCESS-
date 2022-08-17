package SimpleDuck.so3;

public abstract class Duck {
    private QuackBehivior quackBehivior;
    private FlyButter flyButter;

    public void perfromQuack() {
        quackBehivior.quack();
    }
public void performFly(){
    flyButter.fly();
}
    public void setFlyButter(FlyButter flyButter) {
        this.flyButter = flyButter;
    }

    public void setQuackBehivior(QuackBehivior quackBehivior) {
        this.quackBehivior = quackBehivior;
    }

    public abstract void dislay();
}
