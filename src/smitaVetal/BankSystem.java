/*1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.

when calling the method on the first object.
Output: user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time

when calling the method on the second object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .
*/
package smitaVetal;

public class BankSystem {

	int printBalance;
	int debit;
	int credit;
	int balance;
	static int debitCount;
	static int creditCount;
	static int printBalanceCount;
	
	void setUserDetails(int initBalance, String userName) {
			balance = initBalance;
			System.out.println("\nUser name is: " + userName);
			System.out.println("Initial Balance is: " + balance);		
	}
	
	void credit(int amount) {
		balance = balance+amount;
		credit++;
		creditCount++;		
	}
	
	void debit(int amount) {
		if (balance>amount)
		balance=balance-amount;
		else
			System.out.println("You donot have sufficient balance to withdraw");
		debit++;
		debitCount++;		
	}
	
	void printBalance() {
		System.out.println("Current Balance is : " + balance);
		printBalance++;
		printBalanceCount++;
	}
	
	void indiviualTranSummary() {
		System.out.println("Transaction Summary: ");
		System.out.println("Total credit count is :" + credit);
		System.out.println("Total debit count is :" + debit);
		System.out.println("Total Print Balance count is :" + printBalance);	
	}
	
	void allTranSummary() {
		System.out.println("\nAll Transaction Summary: ");
		System.out.println("Total credit count is :" + creditCount);
		System.out.println("Total debit count is :" + debitCount);
		System.out.println("Total Print Balance count is :" + printBalanceCount);	
	}
	
	public static void main(String[] args) {
		BankSystem banksystem1= new BankSystem();
		banksystem1.setUserDetails(10000, "Smita");
		banksystem1.credit(10000);
		banksystem1.debit(3000);
		banksystem1.printBalance();
		banksystem1.credit(40000);
		banksystem1.debit(2000);
		banksystem1.allTranSummary();
		
		BankSystem banksystem2= new BankSystem();
		banksystem2.setUserDetails(22500, "Amol");
		banksystem2.credit(100000);
		banksystem2.debit(30000);
		banksystem2.printBalance();
		banksystem2.credit(40000);
		banksystem2.debit(2000);
		banksystem2.allTranSummary();
		
		
		
	}
}
