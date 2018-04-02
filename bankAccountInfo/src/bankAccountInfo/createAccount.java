package bankAccountInfo;

import java.util.Scanner;

public class createAccount {
	String name,accountTitle;
	String cnic_no,address;
	long acountNo;
	long balance=1000;
	Scanner takeData =new Scanner(System.in);
	createAccount(){
		
	}
	public createAccount(String name, String accountTitle, long accountNumber,long balance,String cnic_no,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.accountTitle=accountTitle;
		this.acountNo=accountNumber;
		this.balance=balance;
		this.cnic_no=cnic_no;
		this.address=address;
	}
	public void setName(){
		System.out.println("Enter the name of Customer");
		name=takeData.nextLine();
	}
	public String getName(){
		return name;
	}

	public void setTitle(){
		System.out.println("Enter the account title");
		accountTitle=takeData.nextLine();
	}
	public String getTitle(){
		return accountTitle;
	}
	public void setAccNo(){
		System.out.println("enter the account number");
		acountNo=takeData.nextLong();
	}
	public long getAccNo(){
		return acountNo;
	}  
	public void setCNIC()
	{
		System.out.println("Enter the Cnic");
		cnic_no=takeData.nextLine();
	}
	public void setAddress() {
		System.out.println("Enter the Adrress");
		address=takeData.nextLine();
		}
	public String getCnic() {
		return cnic_no;
	}
	public String getAddress() {
		return address; 
	}
	public String toString()
	{
		return "name--> "+name+"\nAccountTitle--> "+accountTitle+"\naccountNumber--> "+acountNo+"\nCNIC-NO--> "+cnic_no+"\nAdrress-->"+address+"\nBalance-->"+balance;
	}
}
