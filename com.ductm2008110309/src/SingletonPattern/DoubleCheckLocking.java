public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking intance;

    public DoubleCheckLocking() {
    }
    public static  DoubleCheckLocking getIntance() {
        if (intance == null) {
            synchronized(DoubleCheckLocking.class){
                if (intance == null) {
                    intance = new DoubleCheckLocking();
                }
            }
        }
        return intance;
    }
}
