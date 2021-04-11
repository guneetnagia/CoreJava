package online;

public class Five {

	int solution(int N) {
	int largest = 0;
	int shift = 0;
	int temp = N;
	for(int i = 1; i < 30; ++i) {
	int index = (temp & 1);
	
	temp = ((temp >> 1) | (index << 29));
	if(index > largest) {
	largest = index;
	shift = i;
	}
	}

	return shift;
	}
	
	public static void main(String aaa[]){
		Five f = new Five();
		System.out.println(f.solution(9736));
	}
}
