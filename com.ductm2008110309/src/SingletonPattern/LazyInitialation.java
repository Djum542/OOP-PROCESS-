public class LazyInitialation {
    private static LazyInitialation intance;
    private LazyInitialation(){}
    public static LazyInitialation getintance(){
        if (intance == null) {
            intance = new LazyInitialation();
            
        }
        return intance;
    }
  
}
