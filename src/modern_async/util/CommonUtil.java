package modern_async.util;

public class CommonUtil {

	 public static void delay(long delayMilliSeconds)  {
	        try{
	            Thread.sleep(delayMilliSeconds);
	        }catch (Exception e){
	            System.out.println("Exception is :" + e.getMessage());
	        }

	    }
}
