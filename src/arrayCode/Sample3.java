/**
 * Sum of right elements equals to left element
 */
package arrayCode;

public class Sample3 {
	public static void main(String aaa[]){
		int[] arr = {1,2,3,4,5,5,4,3,2,1};

		int sumR=0;
		int sumL=0;
		//int i=0;
		//int j=arr.length;

		for(int i=0;i<arr.length-1;i++){

			for(int j=arr.length-1;j>0;j--){
				sumL=sumL+arr[i];
				sumR=sumR+arr[j];
			//	if(i<j){
					if(sumL==sumR){
						System.out.println("true " + i + "  "  + j +  " "+sumR + " == "+sumL);
					}
			//	}
			}
		}
	}
}