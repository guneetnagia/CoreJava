package online;

public class SingleDigitMax {
	public static void main(String aaa[]) {
		int arr[] = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
		int max = -9;
		for(int i=0;i<arr.length;i++) {
			if(countDigit(arr[i])){
				max = Math.max(max, arr[i]);
			}
		}
		System.out.println(max);
		//return max;
	}
	
	static Boolean countDigit(int n)
    {
        return (int)Math.floor(Math.log10(n) + 1) == 1 ? true:false;
    }
}
