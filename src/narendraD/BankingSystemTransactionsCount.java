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

NOTE : You should have setUserDetails method to set username and initial Balance . */

package narendraD;

public class BankingSystemTransactionsCount {

    int currentbal;
	
	int debitcount;
	int creditcount;
	int printbalcount;
	
	static int totaldebitcount;
	static int totalcreditcount;
	static int totalprintbalcount;
	
	void debitAmount(int debit) {
		if(debit<currentbal)
		{
			currentbal = currentbal- debit;
			debitcount++;
			totaldebitcount++;
		}
		else
		{
			System.out.println("Insufficient Fund");
		}
			
	}
	
	void creditAmount(int credit) {
		if(credit>0)
		{
			currentbal = currentbal + credit;
			creditcount= creditcount+1;
			totalcreditcount=totalcreditcount+1;

		}
		else
		{
			System.out.println("Invalid Amount Entered");
		}
			
	}
	
	void printBalance() {
		
		printbalcount+=1;
		totalprintbalcount+=1;
		System.out.println("Current Balance is: " + currentbal);
		
	}
	
	void individualTransactionSummary() {
		
		System.out.println("Credit Count is: " + creditcount + " times");
		System.out.println("Debit Count is: " + debitcount +  " times");
		System.out.println("Print Balance Count is: " + printbalcount +  " times");
	}
	
	
    void allTransactionSummary() {
    	
    	System.out.println("\n" + "All Transactions Summary::");
    	System.out.println("Total Credit Count is: " + totalcreditcount + " times");
		System.out.println("Total Debit Count is: " + totaldebitcount +  " times");
		System.out.println("Total Print Balance Count is: " + totalprintbalcount +  " times");
		
	}
    void setUserDetails(String enteruser, int initialbal) {
    	String username = enteruser;
    	currentbal = initialbal;
    	System.out.println("\n" +"*****" +username + "*****");
    	System.out.println("\n" + "Initial balance is: " + currentbal);
    	System.out.println("\n" +"Transaction Summary::");
    	
	}
	
	
	public static void main(String[] args) {
				
		BankingSystemTransactionsCount user1 = new BankingSystemTransactionsCount();
		user1.setUserDetails("user1", 5000);
		user1.creditAmount(2000);
		user1.debitAmount(1000);
		user1.creditAmount(1000);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		BankingSystemTransactionsCount user2 = new BankingSystemTransactionsCount();
		user2.setUserDetails("user2", 10000);
		user2.creditAmount(2000);
		user2.debitAmount(1000);
		user2.creditAmount(3000);
		user2.creditAmount(2000);
		user2.debitAmount(1000);
		user2.creditAmount(3000);
		user2.creditAmount(12000);
		user2.individualTransactionSummary();
		
		new BankingSystemTransactionsCount(). allTransactionSummary();
		
		
				
		
	}


		
}
