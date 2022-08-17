package so2;

import SimpleDuck.Duck;

public class MallarDuck implements so2.Duck, Flyable, Quackable {

    @Override
    public boolean swim() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void deslay() {
        // TODO Auto-generated method stub
        System.out.println("Tôi là một con vịt trời");
    }

    @Override
    public String quack() {
        // TODO Auto-generated method stub
        return "qark";
    }

    @Override
    public boolean fly() {
        // TODO Auto-generated method stub
        return true;
    }

}
