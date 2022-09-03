package deepakBorse.Assignments;

class BankDetails{
	int balance=15000; // instance variable
	int debitCount=0;
	int creditCount=0;
	
	void debitAmt(int Amt){
		if(Amt<=balance){
			balance=balance-Amt;
			System.out.println("Current Balance in account after debit:"+balance);
			debitCount++;
		}else{
			System.out.println("Please maintain sufficient balance");
		}
	}
	void creditAmt(int Amt){
		balance=balance+Amt;
		System.out.println("Current Balance in account after credit:"+balance);
		creditCount++;
	}	
	
	void displayInfo(){
		System.out.println("Current Balance in account:"+balance);
		System.out.println("Number of debit transaction:"+debitCount);
		System.out.println("Number of Credit transaction"+creditCount);
	}
	
	public static void main(String[] args){
		BankDetails BankDetails1=new BankDetails();
		BankDetails1.debitAmt(16000); // withdrwal Amt is greater than balance
		BankDetails1.displayInfo(); //Show the initial balance and counts of debit and credit transaction
		BankDetails1.creditAmt(12000); 
		BankDetails1.debitAmt(2000); 
		BankDetails1.creditAmt(5000);
		BankDetails1.debitAmt(1300); 
		BankDetails1.debitAmt(1200); 
		BankDetails1.displayInfo();
	}
}