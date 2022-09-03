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

NOTE : You should have setUserDetails method to set username and initial Balance .*/

package anujaD;

public class Bank {
	int creditamnt =0;
	int debitamnt=0;
	int currentbalance=0;
	int balance;
	
	static int Ind_Debit_amt;
	static int Ind_Credit_amt;
	static int Ind_printbal_amt;

	void credit(int num) {
		balance = (balance+num);
		creditamnt++;
		Ind_Credit_amt++;
	}
	void debit(int num) {
		balance= (balance-num);
		debitamnt++;
		Ind_Debit_amt++;
		
	}
	void printbal() {
		System.out.println("The Current Balance is : "+balance );
		currentbalance++;
		Ind_Credit_amt++;
	}
	void individualTransactionSummary() {
		System.out.println("The Individual transactions are : " );
		System.out.println("The debit amnt is: " +Ind_Debit_amt );
		System.out.println("The credit amnt is: " +Ind_Credit_amt);
		System.out.println("The current balance is: " +Ind_printbal_amt);
		
	}
	void allTransaction() {
		
		System.out.println("The All transactions are: " );
		System.out.println("The debit amnt is: " +debitamnt );
		System.out.println("The credit amnt is: " +creditamnt);
		System.out.println("The current balance is: " +currentbalance);
	}
	void setUserDetails(String Username,int bal) {
		balance= bal;
		System.out.println("Username is :"+Username );
		System.out.println("Inital Balance is :"+bal );	
		
		
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank bank1 = new Bank();
		
		bank.setUserDetails("Monali",1500);
		bank.debit(120);
		bank.debit(150);
		bank.credit(100);
		bank.credit(100);
		bank.credit(100);
		bank.printbal();
		bank.printbal();
		bank.individualTransactionSummary();

		bank1.setUserDetails("Anuja",1900);
		bank1.debit(106);
		bank1.debit(120);
		bank1.debit(10);
		bank1.credit(1300);
		bank1.credit(1300);
		bank1.credit(1300);
		bank1.printbal();
		bank1.printbal();
		bank1.printbal();
		bank1.individualTransactionSummary();

		bank1.allTransaction();
	}
}
