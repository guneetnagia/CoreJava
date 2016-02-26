/**
 * k largest(or smallest) elements in an array | added Min Heap method
 */

package arrayCode;

public class Sample1 {
	public static void main(String hjg[]){
		Sample1 sam = new Sample1();
		int[] a = {1,4,8,3,6,9};
		int maxK=3;
		sam.bubbleSort(a,maxK);
	}
	void bubbleSort(int[] a,int max){
		for(int i=a.length;i>=0;i--){
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		System.out.println(max +" element is : "+a[max]);
	}
}
