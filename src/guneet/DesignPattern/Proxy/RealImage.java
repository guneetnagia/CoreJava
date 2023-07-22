package guneet.DesignPattern.Proxy;

public class RealImage implements Image{
    private String fileName;
    public RealImage(String fileName){
        System.out.println("real image " + fileName);
        this.fileName = fileName;
    }
    @Override
    public void display() {
        System.out.println("I'm real image, but i am overloaded. you should check with proxy fist");
    }
}
