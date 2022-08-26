public class LazyInitialation {
    private static LazyInitialation intance;
    private LazyInitialation(){}
    public static LazyInitialation getintance(){
        
        if (intance == null) {
            intance = new LazyInitialation();
            
        }
        return intance;
    }
  //Hoạt động tốt trong môi trường đơn luồng.
  // Nó chỉ hoạt động tốt cho đơn luồng còn đa luồng thì
  // nó sẽ có nhiều giá trị khác nhau tại cùng một thời điểm.
// Nó sẽ chậm trong lần đầu sử dụng đàu tiên
}
