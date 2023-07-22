package guneet.DesignPattern.Observer;

public class LogOpenListener implements EventListener{

    @Override
    public void notify(String eventType, String file) {
        System.out.println("LogOpenListener of type " + eventType + " of file " + file);
    }
}
