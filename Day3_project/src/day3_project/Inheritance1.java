package day3_project;
import java.util.*;
import java.io.*;

public class Inheritance1 {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	double bal_amt=1000;
    	Transaction t=new Transaction();
    	Withdrawal w=new Withdrawal();
    	BalanceInquiry b=new BalanceInquiry();
    	int accNum=t.getAccNum();
    	System.out.println("OPTIONS:\n1.Deposit\n2.Withdraw\n3.Balance enquiry");
    	int opt=s.nextInt();
    	if(opt==1) {
    		t.execute();
    		bal_amt=t.returnAmt();
    	}
    	else if(opt==2) {
    		w.execute();
    	}
    	else if(opt==3) {
    		b.execute();
    	}
    	else
    		System.out.println("Enter valid option");
    }
}

class BalanceInquiry{
	 void execute(){
		
		System.out.println("Your current balance is Rs.");
	}
}
class Withdrawal extends BalanceInquiry{
	double amount;
	void execute() {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the amount for withdrawal\n");
	amount=s.nextDouble();
	System.out.println("Rs."+amount+" is withdrawn from your account");
	}
}
class Deposit extends Withdrawal{
	double amount;
	void execute() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		amount=s.nextDouble();
		System.out.println("Rs."+amount+" is deposited in your account");
		}
	double returnAmt() {
		return(amount);
	}
}
class Transaction extends Deposit{
	int accountNum;
	int getAccNum() {
		System.out.println("Enter your account number");
		Scanner s=new Scanner(System.in);
		accountNum=s.nextInt();
		return(accountNum);
	}
}
