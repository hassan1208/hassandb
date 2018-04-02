package bankAccountInfo;
import java.util.Scanner;
public class test {
public static void main(String[] args) {
	accountHolder emp_side=new accountHolder();
	emp_side.setName();
	emp_side.setTitle();
	emp_side.setCNIC();
	emp_side.setAddress();
	emp_side.setAccNo();
	emp_side.setContact();
	
	//Scanner takeData=new Scanner(System.in);
	//int pin=1234; 
	//System.out.println(emp_side.toString());
	//System.out.println("Customer Side");
	//System.out.println("Enter the Name");
	//String cust_name=takeData.nextLine();
	//System.out.println("Enter the pin");
	//int cust_pin=takeData.nextInt();
	//if(cust_name==emp_side.getName()&&cust_pin==pin) {
	bankAccount cust_side=new bankAccount();
	System.out.println("Dear "+emp_side.getName()+"\nyour new balance after transaction is="+cust_side.getBalance()+" " );
	}
	
	
}

