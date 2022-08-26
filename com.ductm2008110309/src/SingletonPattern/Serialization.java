import java.io.Serializable;

import singleton.ops.impl.OpId.Log;

public class Serialization implements Serializable {
    public static void main(String[] args) {
        Serialization se = new Serialization();
        se.getIntance();
    }
    private static final long  serialazation = 2008110309L;
// Trong hệ thống phân tán ta phải imlement Serializable đẻ lưu trữ trạng thái vào file hệ thống cho dễ truy xuất.
    public Serialization() {
    }
// Áp dụng phong cách của bill pugh.
private static class SingletonHelper{
    private static final Serialization intance = new Serialization();
   
}
// public static Serialization getInstance() {
//     return SingletonHelper.intance;
// }
public static Serialization getIntance(){
    return SingletonHelper.intance;
}
}
    

