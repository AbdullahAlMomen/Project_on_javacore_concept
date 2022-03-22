import java.util.Random;

public class Bank_Account {

	private int account_num;
	private String customer_name;
	private int account_balance;
	public int getAccount_num() {
		return account_num;
	}
	public void setAccount_num(int account_num) {
		this.account_num = account_num;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}
	public Bank_Account(int account_num, String customer_name, int account_balance) {
		super();
		
		this.account_num = account_num;
		this.customer_name = customer_name;
		this.account_balance = account_balance;
	}
	public Bank_Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void deposite(int balance) {
		account_balance+=balance;
		Random r =new Random();
		Transection t=new Transection(r.nextInt(),this.account_num,"deposit",balance,account_balance);
		TransectionDetails.addinList(t);
	}
	
	public void withdraw(int balance) throws InsufficientBalanceException {
		
		if(account_balance<balance)  {
			throw new InsufficientBalanceException();
		}
		account_balance-=balance;
		Random r =new Random();
		Transection t=new Transection(r.nextInt(),this.account_num,"withdraw",balance,account_balance);
		TransectionDetails.addinList(t);
	}
	
}
