package guneet.java8.lambdas;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {
	public static void main(String aaa[]){
		/*FileFilter filter = new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith(".js");
			}
		};*/
		FileFilter filter = (File pathname) -> pathname.getName().endsWith(".java");
		
		File dir = new File("E:/");
		File[] files = dir.listFiles(filter);
		for(File f:files){
			System.out.println(f);
		}
	}
}
