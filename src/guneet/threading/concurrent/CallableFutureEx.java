package guneet.threading.concurrent;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableFutureEx {
	
	static class GitHubDetails implements Callable<Integer>{
		@Override
		public Integer call(){
			int responseCode = 0;
			try{
				Thread.sleep(2000);
				URL gitLink = new URL("https://api.github.com/users/guneetnagia/repos");
				HttpURLConnection connection = (HttpURLConnection) gitLink.openConnection();
				connection.setRequestMethod("GET");
				responseCode = connection.getResponseCode();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return responseCode;

		}
	}

	public static void main(String aaa[]) throws IOException, InterruptedException, ExecutionException, TimeoutException{
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<Integer> future = ex.submit(new GitHubDetails());
		System.out.println(future);
		//future.cancel(true);
		//future.isCancelled();
		//System.out.println(future.isDone());
		System.out.println(future.get(5000,TimeUnit.MILLISECONDS));   // get is blocking operation
		
		System.out.println("Why should i be waiting...");
	}
}

