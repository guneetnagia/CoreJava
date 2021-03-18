package guneet.misc;
interface Kada{
	static void material(){
		System.out.println("gold");
	}
}

public class Tanishq implements Kada{
	public static void main(String aaa[]){
		Kada.material();
		Tanishq t = new Tanishq();
		/*t.material();
		Tanishq.material();*/
	}
}