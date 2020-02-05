package guneet.DesignPattern.Singleton;

public class LazyAccounCreation {
	public static void main(String aaa[]){
		AccountCreation ac1 = AccountCreation.getInstance();
		AccountCreation ac2 = AccountCreation.getInstance();
		AccountCreation ac3 = AccountCreation.getInstance();
		ac1.Create(101);ac2.Create(102);ac3.Create(103);
	}
}


class AccountCreation{
	private AccountCreation(){}
	private static AccountCreation instance;
	public static AccountCreation getInstance(){
		if(instance == null){
			instance = new AccountCreation();
		}
		return instance;
	}
	public void Create(int number){
		System.out.println("account created " + number);
	}
}