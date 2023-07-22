package guneet.DesignPattern.facade;

public class Client {
    public static void main(String args[]){
        NetworkInterceptor networkInterceptor = new NetworkInterceptor();
        networkInterceptor.communicate();
    }
}
