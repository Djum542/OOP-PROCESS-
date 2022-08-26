public class StaticBlockSingleton {
    //Khai báo biến Intance

    private static final StaticBlockSingleton intance;
    //Khởi tạo contructor riêng để tránh lớp khác truy cập 
    private StaticBlockSingleton(){

    }

   // Khởi tạo khối tĩnh để xử lý ngoại lệ
    static{
        try{
            //Khởi tạo Singleton class khi được gọi đến
            intance = new StaticBlockSingleton();
        }catch(Exception e){
            // Khi có ngoại lệ xẩy ra thì sẽ đưa ra thông báo.
            throw new RuntimeException("Exception occured in creating");

        }
    }
    // Khai báo getter có kiểu là Singleton class.
    public static StaticBlockSingleton getIntance(){
        return intance;
    }
}
