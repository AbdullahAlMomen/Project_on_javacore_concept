import java.util.ArrayList;
import java.util.List;

public class TransectionDetails {
	public static List<Transection> transection_history=new ArrayList<>();
	
	public static void addinList(Transection T) {
		transection_history.add(T);
	}
	
	public static void show_info(int account_number) {
		
		for(Transection t:transection_history) {
			if(t.getAccount_number()==account_number) {
				System.out.println(t);
				
			}
		}
		
		
	}
}
