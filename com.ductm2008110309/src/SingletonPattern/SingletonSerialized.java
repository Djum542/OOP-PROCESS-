import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
 


 
public class SingletonSerialized {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
 
        Serialization serializedSingleton1 = Serialization.getInstance();
        EnumSingleton enumSingleton1 = EnumSingleton.intance;
 
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SingletonSerializedTest.txt"));
        out.writeObject(serializedSingleton1);
        out.writeObject(enumSingleton1);
        out.close();
 
        // De-serialize from file to object
        ObjectInput in = new ObjectInputStream(new InputStream("SingletonSerializedTest.txt"));
        Serialization serializedSingleton2 = (Serialization) in.readObject();
        EnumSingleton enumSingleton2 = (EnumSingleton) in.readObject();
        in.close();
 
        System.out.println("serializedSingleton1 hashCode=" + serializedSingleton1.hashCode());
        System.out.println("serializedSingleton2 hashCode=" + serializedSingleton2.hashCode());
        System.out.println("enumSingleton1 hashCode=" + enumSingleton1.hashCode());
        System.out.println("enumSingleton2 hashCode=" + enumSingleton2.hashCode());
    }
}

