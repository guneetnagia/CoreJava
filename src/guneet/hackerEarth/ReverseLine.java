package guneet.hackerEarth;

public class ReverseLine {
	public static void main(String aaa[]){
		String s = "A lazy fox is sleeping";
		System.out.println("Before reverse : " + s);
		String[] splitted = s.split(" ");
		ReverseLine.reverse(splitted,0,splitted.length-1);		
	}
	
	public static void reverse(String[] str, int start,int end){
		
		StringBuffer reversed = new StringBuffer();
		for(int i=end;i>start;i--){
			if(i==1){
				reversed.append(str[i]);
				break;
			}
			reversed.append(str[i]+" ");
		}
		System.out.println(reversed);
	}
}
