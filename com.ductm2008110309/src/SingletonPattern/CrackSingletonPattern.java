import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CrackSingletonPattern {
    public static void main(String[] args) throws InstantiationException
    ,IllegalAccessException, InvocationTargetException{
        EagerInitializationn intance1 = EagerInitializationn.getIntance();
        EagerInitializationn intance2 = null;
        Constructor<?>[] constructors = EagerInitializationn.class.getDeclaredConstructors();
        for(Constructor<?> constructor:constructors){
            constructor.setAccessible(true);
            intance2 = (EagerInitializationn) constructor.newInstance();

        }
        System.out.println(intance1.hashCode());
        System.out.println(intance2.hashCode());
    }
}
