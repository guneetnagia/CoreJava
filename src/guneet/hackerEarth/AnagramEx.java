package guneet.hackerEarth;

public class AnagramEx {
	public static void main(String aaa[]){
		Boolean isAna = true;
		String a = "anagramm";
		String b = "marganaa";
		
		int c[] = new int[256];
		for(char ch:a.toCharArray()){
			int index = (int) ch;
			c[index]++;
		}
		for(char ch:b.toCharArray()){
			int index = (int) ch;
			c[index]--;
		}
		for(int i=0;i<256;i++){
			if(c[i]!=0){
				isAna = false;
				break;
			}
		}
		System.out.println(isAna);
	}
}
