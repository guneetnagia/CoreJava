package guneet.collection.ArrayList;

public class RotateLeft {
	public static void main(String aaa[]){
		RotateLeft rl = new RotateLeft();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		rl.leftRotate(arr, arr.length, 2);
	}
	
	void leftRotate(int[] arr, int n, int d) {
        // code here
        int mod = d%n;
        
        for(int i=0;i<n;i++){
            System.out.print(arr[(i+mod)%n] + " ");
        }
    }
}
