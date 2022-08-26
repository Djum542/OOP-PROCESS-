public class ThreadSafe {
    private static volatile ThreadSafe intance;

    private ThreadSafe() {
    }
    // Ta gọi phương thức synchronized của hàm get để đảm bảo
    // chỉ có một luồng và một giá trị duy nhấ tai cùng một thời điểm.
    // Nhưng khi dùng phương thức synchroized thì phần mềm chạy rất chậm,
    // tốn hiêu xuất, tốn thời gian khi có thread khác gọi mà tài nguyên đang được sử dụng thì thread đó sẽ phải chờ.
    public static synchronized ThreadSafe getintance(){
        if (intance == null) {
            intance = new ThreadSafe();
        }
        return intance;
    }
}
