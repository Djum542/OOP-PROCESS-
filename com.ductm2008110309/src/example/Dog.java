package example;
public class Dog implements Ieat, Imakenoise {

    @Override
    public void makenoise() {
        // TODO Auto-generated method stub
        System.out.println("eat: meat, fish, egg");
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println("makenoise: brak, brak");
    }

}
