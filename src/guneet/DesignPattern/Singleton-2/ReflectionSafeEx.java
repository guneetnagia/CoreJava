package dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectionSafeEx {
    private ReflectionSafeEx(){
        if(instance != null){
            throw new RuntimeException("We are attacked!");
        }

    }
    private static ReflectionSafeEx instance = new ReflectionSafeEx();
    public static ReflectionSafeEx getInstance(){
        return instance;
    }

    public static void main(String args[]) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        ReflectionSafeEx ex1 = ReflectionSafeEx.getInstance();
        ReflectionSafeEx ex2 = null;

        try{
            Constructor[] constructors = ReflectionSafeEx.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
             constructor.setAccessible(true);
             ex2 = (ReflectionSafeEx) constructor.newInstance();
             break;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(ex1.hashCode() + " != "+ ex2.hashCode());
    }

    // solution: Throw exception from private constructor if instance is already initiated.

}
