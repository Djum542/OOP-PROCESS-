import java.rmi.server.Skeleton;

public class Lazy {
    private static Lazy obj;
    private Lazy(){}
    public static Lazy getLazy(){
        if (obj == null) {
            synchronized(Skeleton.class){
                if (obj == null) {
                    obj = new Lazy();
                }
            }
        }
        return obj;
    }
    public void doSomething(){
        System.out.println(obj);
    } 
}
