package dp.singleton;

public class LazyEx {
    private LazyEx(){}
    private static LazyEx instance;
    public static LazyEx getInstance(){
        if(instance == null) {
            instance = new LazyEx();
        }
        return instance;
    }
    public static void main(String args[]){
        LazyEx ex1 = LazyEx.getInstance();
        LazyEx ex2 = LazyEx.getInstance();
        System.out.println(ex1.hashCode() + " = " +ex2.hashCode());
    }
}
