import java.io.Serializable;

import singleton.ops.impl.OpId.Log;

public class Serialization implements Serializable {
    private static final long  serialazation = 2008110309L;

    public Serialization() {
    }
private static class SingletonHelper{
    private static final Serializable intance = new Serializable() {
        
    };
    public static Serializable getIntance(){
        return SingletonHelper.intance;
    }
}
public static Serialization getInstance() {
    return null;
}
}
