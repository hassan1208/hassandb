package bankAccountInfo;
import java.util.Scanner;
public class bankAccount extends accountHolder implements accountTransaction{
	long newBalance;
	long deposit,withDraw;
	Scanner takeData=new Scanner(System.in);
	
	bankAccount(){
		
		setBalance();
		
	}
	
	
	public void setBalance() {
		System.out.println("press 1  for withdrawal and 2 for deposit");
		int choice=takeData.nextInt();
		if(choice==1) {
			enterWithDrawalAmmount();
		/*System.out.println("if you want to withdrawal more money than press 1 ");
		int withdraw_choice=takeData.nextInt();
		if(withdraw_choice==1) {
			withDrawal();}*/
		}
		if(choice==2) {
			enterDepositAmmount();
		/*System.out.println("if you want to deposit more money than press 1 ");
		int deposit_choice=takeData.nextInt();
		if(deposit_choice==1) {
			depositAmmount();}*/
		
		}
		/*else {
			System.out.println("please Enter the correct number");
			setBalance();
		}*/
	}
	public void enterWithDrawalAmmount()
	{
		System.out.println("Enter the withDraw Ammount");
		withDraw=takeData.nextLong();
		if(withDraw>balance) {
			System.out.println("your account balance is not enough");
			System.out.println("plzz enter withdrawal ammount again");
			enterWithDrawalAmmount();
		}
		else {
			newBalance=balance-withDraw;
			balance=newBalance;
		}
		
		
	}
	public void enterDepositAmmount() {
		System.out.println("Enter the amount which  u want to deposit");
		deposit=takeData.nextLong();
		newBalance=balance+deposit;
		balance=newBalance;
		
		
		
	}
	public long getBalance() {
		return balance;
	}
}
