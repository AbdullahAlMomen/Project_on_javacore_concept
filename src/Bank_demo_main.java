
public class Bank_demo_main {

	public static void main(String[] args) throws InsufficientBalanceException {
		// TODO Auto-generated method stub
		
		Bank_Account ob=new Bank_Account(1,"momen",600);
		ob.deposite(1200);
		ob.withdraw(2000);
		TransectionDetails.show_info(1);

	}

}
