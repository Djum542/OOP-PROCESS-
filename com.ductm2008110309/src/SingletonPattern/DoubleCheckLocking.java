public class DoubleCheckLocking {
    // Dùng phương thức volatile để kiểm tra hai lần trước khi khởi tạo Intance.
    private static volatile DoubleCheckLocking intance;

    public DoubleCheckLocking() {
    }
    public static  DoubleCheckLocking getIntance() {
        //Lmà gì đó trước khi xuất ra intance
        if (intance == null) {
            //Làm nhiệm vụ dài trước khi khởi tạo
            // Chặn các luồng không cho vào khi khởi tạo
            synchronized(DoubleCheckLocking.class){
                //Kiêm tra lại lần nữa trước khi luồng khác vào
                if (intance == null) {
                    intance = new DoubleCheckLocking();
                }
            }
        }
        // làm vài điều sau khi xuất ra Intance.
        return intance;
    }
}
