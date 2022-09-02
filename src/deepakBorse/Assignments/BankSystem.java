/*
Assignment - 13 : 1st Sep'2022

Create a Banking System which has the following functionality.

Create two objects to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.

when calling the method on the first object.
Output: user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

when calling the method on the first object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance */


package deepakBorse.Assignments;

public class BankSystem {
	
	static int odebitCount, ocreditCount,oprintbalcount;
	int balance,idebitCount,icreditCount,iprintbalcount;
	String name;
		
	void Accountholder(String name, int ibalance) {
		balance=ibalance;
		this.name=name;
		System.out.println("Name of the Account holder: "+this.name);
		System.out.println("Initial Balance of the "+this.name+ ": "+balance);
		
	}
	void debitAmount(int debitamt) {
		balance=balance-debitamt;
		System.out.println("Amount debited "+debitamt+ " from the balance");
		idebitCount++;
		odebitCount++;
	}
	
	void creditAmount(int creditamt) {
		balance=balance+creditamt;
		System.out.println("Amount credited "+creditamt+ " into the balance");
		icreditCount++;
		ocreditCount++;
	}
	
	void printBalance() {
		System.out.println("Current balance :"+balance);
		iprintbalcount++;
		oprintbalcount++;
	}
	
	void IndTransSummary() {
		System.out.println("----------Bank statement--------------");
		System.out.println("Name of the account holder :"+this.name);
		System.out.println("Current Balance :"+balance);
		System.out.println("Individual credit count :"+icreditCount);
		System.out.println("Individual debit count :"+idebitCount);
		System.out.println("Individual print count :"+iprintbalcount);
	}
	
	void OverallTransSummary() {
		System.out.println("Overall credit count :"+ocreditCount);
		System.out.println("Overall debit count :"+odebitCount);
		System.out.println("Overall print count :"+oprintbalcount);
	}
	public static void main(String[] args) {
		BankSystem BankSystem1=new BankSystem();
		BankSystem BankSystem2=new BankSystem();
		
		BankSystem1.Accountholder("Haaresh", 10000);
		BankSystem1.creditAmount(20000);
		BankSystem1.debitAmount(1000);
		BankSystem1.debitAmount(3000);
		BankSystem1.printBalance();
		BankSystem1.IndTransSummary();
		System.out.println("-------------------------------");
		BankSystem2.Accountholder("Harsheel", 20000);
		BankSystem2.creditAmount(5000);
		BankSystem2.debitAmount(10000);
		BankSystem2.creditAmount(15000);
		BankSystem2.printBalance();
		BankSystem2.debitAmount(3000);
		BankSystem2.printBalance();
		BankSystem2.IndTransSummary();
		
		System.out.println("-------------------------------");
		BankSystem1.OverallTransSummary();
		
	}

}
