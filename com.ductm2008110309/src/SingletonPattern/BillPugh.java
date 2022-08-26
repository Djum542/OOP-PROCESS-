public class BillPugh {
    
    public BillPugh() {
    }
// Tạo ra lớp lồng giúp tách biệt chức năng cho lớp chức năng rõ ràng hơn.
private static class SingletonHelper {
    private static final BillPugh intance = new BillPugh();
}
// Khi single ton vào bộ nhớ thì singleHepler chưa vào bộ nhớ
// cho tời khi gọi getter
    private static BillPugh getIntance(){
        return SingletonHelper.intance;
    }
}
