public class ThreadSafe {
    private static volatile ThreadSafe intance;

    public ThreadSafe() {
    }
    public static synchronized ThreadSafe getintance(){
        if (intance == null) {
            intance = new ThreadSafe();
        }
        return intance;
    }
}
