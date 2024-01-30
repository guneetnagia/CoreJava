package dp.singleton;

public class ThreadSafeEx {
    private ThreadSafeEx(){};
    private static ThreadSafeEx instance;
    public static ThreadSafeEx getInstance(){
        if(instance == null){
            synchronized (ThreadSafeEx.class){
                if(instance == null){
                    instance = new ThreadSafeEx();
                }

            }
        }
        return instance;
    }

    public static void main(String args[]){
        ThreadSafeEx ex1 = ThreadSafeEx.getInstance();
        ThreadSafeEx ex2 = ThreadSafeEx.getInstance();
        System.out.println(ex1.hashCode() + " = " +ex2.hashCode());
    }
}
