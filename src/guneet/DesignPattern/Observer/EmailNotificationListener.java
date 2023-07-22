package guneet.DesignPattern.Observer;

public class EmailNotificationListener implements EventListener{

    @Override
    public void notify(String eventType, String file) {
        System.out.println("EmailNotificationListener of type " + eventType + " of file " + file);
    }
}
