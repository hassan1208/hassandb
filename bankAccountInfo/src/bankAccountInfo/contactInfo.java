package bankAccountInfo;
import java.util.Scanner;
public class contactInfo extends createAccount{
long ph_No;
Scanner takeData=new Scanner(System.in);
contactInfo(){
	
}
contactInfo(String name, String accountTitle, long accountNumber,long balance,String cnic_no,String address,long ph_No){
	super(name,accountTitle,accountNumber,balance,cnic_no,address);
	this.ph_No=ph_No;
}
public void setContact() {
	System.out.println("Enter the Contact Number");
	ph_No=takeData.nextLong();
}
public long getContact() {
	return ph_No;
}
public String toString() {
	return "name--> "+name+"\nAccountTitle--> "+accountTitle+"\naccountNumber--> "+acountNo+"\nCNIC-NO--> "+cnic_no+"\nAdrress-->"+address+"\nbalance-->"+balance+"\nContact-->"+ph_No;
}
}
