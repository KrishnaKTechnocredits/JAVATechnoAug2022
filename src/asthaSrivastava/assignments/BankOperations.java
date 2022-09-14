/*Create a Banking System which has the following functionality.

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

NOTE : You should have setUserDetails method to set username and initial Balance .

*/package asthaSrivastava.assignments;

public class BankOperations {
	int balance;
	static int debitCount;
	static int creditCount;
	static int currentBalance;
	int iDebitCount;
	int iCreditCount;
	int iCurrentBalance;
	
	void setUserDetails(String name, int iBal) {
		balance= iBal;
		System.out.println("Username is "+name );
		System.out.println("Inital Balance is :"+balance );		
	}
	
	void debitOp(int num) {
		balance = balance - num;
		debitCount++;
		iDebitCount++;
	}
	
	void creditOp(int num) {
		balance = balance +  num;
		creditCount++;
		iCreditCount++;
	}
	
	void printBalance() {
		System.out.println("Current Balance is "+balance );
		currentBalance++;
		iCurrentBalance++;
	}
	
	void individualTransactionSummary() 
	{
		System.out.println("User Transaction Summary is: ");
		System.out.println("Print Balance count is "+iCurrentBalance );
		System.out.println("Debit count is :"+iDebitCount );
		System.out.println("Credit count is : "+iCreditCount );
		System.out.println("---------" );
	}
	
	void allTransactionSummary()
	{
		System.out.println("All Transaction Summary is: ");
		System.out.println("Print Balance count is "+currentBalance );
		System.out.println("Debit count is:"+debitCount );
		System.out.println("Credit count is : "+creditCount );
		System.out.println("---------" );
	}
	
	
	public static void main(String[] args) {
		BankOperations bankOp1 = new BankOperations();
		BankOperations bankOp2 = new BankOperations();
		
		bankOp1.setUserDetails("User1",1500);
		bankOp1.debitOp(120);
		bankOp1.debitOp(150);
		bankOp1.creditOp(100);
		bankOp1.creditOp(100);
		bankOp1.creditOp(100);
		bankOp1.printBalance();
		bankOp1.printBalance();
		bankOp1.individualTransactionSummary();
		
		bankOp2.setUserDetails("User2",1900);
		bankOp2.debitOp(106);
		bankOp2.debitOp(120);
		bankOp2.debitOp(10);
		bankOp2.creditOp(1300);
		bankOp2.creditOp(1300);
		bankOp2.creditOp(1300);
		bankOp2.printBalance();
		bankOp2.printBalance();
		bankOp2.printBalance();
		bankOp2.individualTransactionSummary();
		
		bankOp2.allTransactionSummary();
		
		}

}
