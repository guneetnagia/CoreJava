package guneet.hackerEarth;

public class GeneratePalindrome{

	public static void main(String aaa[]){
		GeneratePalindrome gp = new GeneratePalindrome();
		gp.solution(3, 2);
	}
	public void solution(int N, int K) {
		// write your code in Java SE 8
		StringBuffer sb = new StringBuffer();
		int counter = K;
		int count2 = 0;

		char last = 'a';
		for (char i='a';i<='z' && counter>0;i++)      
		{
			sb.append(i);
			last = i;
			counter--;
			count2++;
		}
		System.out.println(sb.toString());
		
		for(int j=0;j<N%K && count2<=N/2;j++)
		{
			sb.append(last);
		}
		System.out.println(sb.toString());
		counter = N-K;
		for(char l = last; l>='a' && counter>0 ;l--)
		{
			if(counter == 1){
                l--;
            }
			sb.append(l);
			counter--;
		}
		System.out.println(sb.toString());
	}
}
