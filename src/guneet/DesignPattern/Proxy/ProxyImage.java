package guneet.DesignPattern.Proxy;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        System.out.println("Proxy image displaying " + fileName);
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
        System.out.println("Proxy image logging " + fileName);
    }
}
