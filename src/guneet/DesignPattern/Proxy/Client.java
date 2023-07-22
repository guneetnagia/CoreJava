package guneet.DesignPattern.Proxy;

public class Client {
    public static void main(String args[]){
        Image image = new ProxyImage("some file");
        image.display();
        image.display();
        image.display();
    }
}
