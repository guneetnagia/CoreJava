package dp.singleton;

import java.io.*;

public class SerializationSafeEx implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationSafeEx(){}

    private static class SingletonHelper {
        private static final SerializationSafeEx instance = new SerializationSafeEx();
    }

    public static SerializationSafeEx getInstance() {
        return SingletonHelper.instance;
    }

    //solution
    protected Object readResolve() {
        return getInstance();
    }


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        SerializationSafeEx instanceOne = SerializationSafeEx.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(instanceOne);
        out.close();

        // deserialize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializationSafeEx instanceTwo = (SerializationSafeEx) in.readObject();
        in.close();

        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());

    }
}
