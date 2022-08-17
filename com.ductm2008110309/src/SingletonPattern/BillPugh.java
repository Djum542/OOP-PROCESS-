public class BillPugh {
    
    public BillPugh() {
    }
private static class SingletonHelper {
    private static final BillPugh intance = new BillPugh();
}
    private static BillPugh getIntance(){
        return SingletonHelper.intance;
    }
}
