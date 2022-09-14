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

when calling the method on the first object.
Output: user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance .
 * 
 */

package harshalRane.Assignments.assignment13BankingSystem;

class BankingSystem1{
	int balance;
	int debitCount;
	int creditCount;
	int printBalanceCount;
	static int deb;
	static int cred;
	static int printBal;
	
	void setUserDetails(String user, int bal){
		balance = bal;
		System.out.println("-------");
		System.out.println(user);
		System.out.println("-------");
		System.out.println("Your Initial Balance is: " +balance); 	
	}
	
	void creditAmount(int credit){
		balance = balance + credit;
		creditCount++;
		cred++;
	}
	
	void debitAmount(int debit){
		balance = balance - debit;
		debitCount++;
		deb++;
	}
	
	void printBalance(){
		System.out.println("Your Current Balance is " + balance);
		printBalanceCount++;
		printBal++;
	}
	
	void individualTransactionSummary(){
		System.out.println("\nTransaction Summary:");
		System.out.println("Credited: "+creditCount+" times");
		System.out.println("Debited: "+debitCount+" times");
		System.out.println("Balance Printed: "+printBalanceCount+" time\n");
	}
	
	void allTransactionSummary(){
		System.out.println("-----------------------");
		System.out.println("All Transaction Summary:");
		System.out.println("-----------------------");
		System.out.println("Credited: "+cred+" times");
		System.out.println("Debited: "+deb+" times");
		System.out.println("Balance Printed: "+printBal+" time\n");
	}
	
	public static void main(String[] args){
		BankingSystem1 bankingSystem1 = new BankingSystem1();
		bankingSystem1.setUserDetails("User1",10000);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.creditAmount(5000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		
		bankingSystem1.setUserDetails("User2",50000);
		bankingSystem1.creditAmount(1500);
		bankingSystem1.debitAmount(2600);
		bankingSystem1.creditAmount(2500);
		bankingSystem1.debitAmount(600);
		bankingSystem1.creditAmount(7000);
		bankingSystem1.creditAmount(300);
		bankingSystem1.creditAmount(1000);
		bankingSystem1.individualTransactionSummary();
		
		BankingSystem1 bankingSystem2 = new BankingSystem1();	
		bankingSystem2.allTransactionSummary();
		
	}	
}