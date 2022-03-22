
public class Transection {
	private int transection_number;
	private int account_number;
	private String transection_type;
	private int transection_ammount;
	private int after_transection;
	public Transection() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transection(int transection_number, int account_number, String transection_type, int transection_ammount,
			int after_transection) {
		super();
		this.transection_number = transection_number;
		this.account_number = account_number;
		this.transection_type = transection_type;
		this.transection_ammount = transection_ammount;
		this.after_transection = after_transection;
	}
	public int getTransection_number() {
		return transection_number;
	}
	public void setTransection_number(int transection_number) {
		this.transection_number = transection_number;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getTransection_type() {
		return transection_type;
	}
	public void setTransection_type(String transection_type) {
		this.transection_type = transection_type;
	}
	public int getTransection_ammount() {
		return transection_ammount;
	}
	public void setTransection_ammount(int transection_ammount) {
		this.transection_ammount = transection_ammount;
	}
	public int getAfter_transection() {
		return after_transection;
	}
	public void setAfter_transection(int after_transection) {
		this.after_transection = after_transection;
	}
	@Override
	public String toString() {
		return "Transection [transection_number=" + transection_number + ", account_number=" + account_number
				+ ", transection_type=" + transection_type + ", transection_ammount=" + transection_ammount
				+ ", after_transection=" + after_transection + "]";
	}

}
