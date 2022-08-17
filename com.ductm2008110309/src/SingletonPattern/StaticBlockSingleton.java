public class StaticBlockSingleton {
    private static final StaticBlockSingleton intance;
    private StaticBlockSingleton(){

    }
    static{
        try{
            intance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating");

        }
    }
    public static StaticBlockSingleton getIntance(){
        return intance;
    }
}
