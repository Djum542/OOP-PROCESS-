public  class DemoA {
    // Thật dễ dàng instance sẽ tạo mới sau khi chạy
    private static DemoA obj = new DemoA();
private DemoA(){}
public static DemoA getDemoA(){

    return obj;
}
public static void doSomething(){
    System.out.println("Thử nghiệm Singleton Pattern cho tôi xem nào");
}

}
