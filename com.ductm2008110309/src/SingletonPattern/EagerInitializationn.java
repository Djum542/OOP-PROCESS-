
public class EagerInitializationn {
    // Khởi tạo singleton class khi được gọi đến.
    private static final EagerInitializationn Intance = new EagerInitializationn();
// Khởi tạo contructor riêng để tránh lớp khác truy cập đến lớp này.
    private EagerInitializationn() {
    }
    // Khai báo getter để sử dụng Intance.
    public static EagerInitializationn getIntance() {
        return Intance;
    }
}
