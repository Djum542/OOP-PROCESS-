import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreak {
    public static void main(String[] args) throws InstantiationException, IllegalAccessError, InvocationTargetException{
        // Khai báo intanceOne và IntanceTwo trong đó.
EagerInitializationn intanceOne  = EagerInitializationn.getIntance();
EagerInitializationn intanceTwo = null;  
// Khai báo contructor có kiểu là bất định có chứa chuỗi
Constructor<?>[] constructors = EagerInitializationn.class.getDeclaredConstructors();
for (Constructor<?> constructor : constructors) {
    
    constructor.setAccessible(true);
    try {
        intanceTwo = (EagerInitializationn) constructor.newInstance();
    } catch (IllegalAccessException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } 
}      
System.out.println(intanceOne.hashCode());
System.out.println(intanceTwo.hashCode()); 
    }
   
}
// Phá hủy cấu  trúc của Eager Initialization, Bill Pugh