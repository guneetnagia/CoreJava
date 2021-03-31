package guneet.threading.concurrent;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CompletableFutureEx {
	static class GitHubDetails implements Runnable{
		@Override
		public void run(){
			HttpURLConnection connection = null;
			int respCode = 0;
			try{
				Thread.sleep(4000);
				URL gitLink = new URL("https://api.github.com/users/guneetnagia/repos");
				connection = (HttpURLConnection) gitLink.openConnection();
				connection.setRequestMethod("GET");
				respCode = connection.getResponseCode();
			}
			catch(Exception e){

			}
		}
	}
		public static void main(String aaa[]) throws IOException, InterruptedException, ExecutionException, TimeoutException{

			//System.out.println(CompletableFutureEx.completableFutureMethod());
			System.out.println("Why should i be waiting...");

		}

	//	public static Integer completableFutureMethod() throws InterruptedException, ExecutionException{

		//	CompletableFuture cf = CompletableFuture.runAsync();		

		//	return (Integer) cf.get();
	//	}
	}
