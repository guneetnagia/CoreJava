package guneet.misc;

public class EqualHash {
	public int employeeId;
	public String firstName, lastName;
	public int yearStarted;
	
	@Override
	public int hashCode() {
		return employeeId;
	}
	
	/*@Override
	public boolean equals(EqualHash e){
		return this.employeeId == e.employeeId;
	}*/
	
	public static void main(String aaa[]){
		EqualHash e1 = new EqualHash();
		e1.employeeId=101;
		
		EqualHash e2 = new EqualHash();
		e2.employeeId = 101;
		
		if(e1.equals(e2)){
			System.out.println("Success");
		}
		else{
			System.out.println("Fail");
		}
	}
	
}
