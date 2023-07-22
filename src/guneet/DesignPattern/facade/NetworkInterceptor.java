package guneet.DesignPattern.facade;

public class NetworkInterceptor {
    private Comm comm;
    private Convertor convertor;
    private Intercetor intercetor;
    private Cache cache;
    public void communicate(){
        cache.clear();
        comm.send();
        comm.recieve();
        intercetor.intercept();
        convertor.convert();
    }
}
