
public class EagerInitializationn {
    private static final EagerInitializationn Intance = new EagerInitializationn();

    private EagerInitializationn() {
    }
    public static EagerInitializationn getIntance() {
        return Intance;
    }
}
