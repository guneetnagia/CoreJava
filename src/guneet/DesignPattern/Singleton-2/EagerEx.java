package dp.singleton;

public class EagerEx {
    private static EagerEx instance = new EagerEx();
    private EagerEx(){}
    public static EagerEx getInstance(){
        return instance;
    }

    public static void main(String args[]){
        EagerEx ex1 = EagerEx.getInstance();
        EagerEx ex2 = EagerEx.getInstance();
        System.out.println(ex1.hashCode() + " = " +ex2.hashCode());
    }
}
