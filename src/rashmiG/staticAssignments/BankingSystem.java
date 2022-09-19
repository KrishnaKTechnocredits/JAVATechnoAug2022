/*Assignment - 13 : 1st Sep'2022

Create a Banking System which has the following functionality.

Create two objects to perform the below scenario.
1) Method to debit amount
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

NOTE : You should have setUserDetails method to set username and initial Balance */

package rashmiG.staticAssignments;

class BankingSystem{
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int totalDebitCount;
	static int totalCreditCount;
	static int totalPrintBalanceCount;
	String name;
	int balance;
	
	void setUserDetails(String name, int balance){
		this.name = name;
		this.balance = balance;
	}
	
	void debit(int amt){
		balance = balance - amt;
		debitCount++;
		totalDebitCount++;
	}
	
	void credit(int amt){
		balance = balance+amt;
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance(){
		System.out.println(name+" current balance is "+balance);
		printBalanceCount++;
		totalPrintBalanceCount++;
		
	}
	
	void individualTransactionSummary(){
		System.out.println(name+" performed debit operation  "+debitCount+" times");
		System.out.println(name+" performed credit operation  "+creditCount+" times");
		System.out.println(name+" checked the balance "+printBalanceCount+" times");
	}
	
	void allTransactionSummary(){
		System.out.println("Debit operation performed by all users : "+totalDebitCount+" times");
		System.out.println("credit operation performed by all users : "+totalCreditCount+" times");
		System.out.println("Balance checked by all users : "+totalPrintBalanceCount+" times");
	}
	
	public static void main(String[] args){
		BankingSystem bankingSystem = new BankingSystem();
		
		bankingSystem.setUserDetails("user1", 15000);
		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("user2", 20000);
		bankingSystem.debit(5000);
		bankingSystem.credit(2000);
		bankingSystem1.debit(2000);
		bankingSystem.printBalance();
		bankingSystem.individualTransactionSummary();
		bankingSystem.allTransactionSummary();
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		bankingSystem1.allTransactionSummary();
	}
}
		