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
package monali;

public class Assignment13 {
	int balance;
	 int creditamnt;
	 int debitamnt;
	 int currentbal;
	static int Ind_credit_amnt;
	static int Ind_debit_amnt;
	static int Ind_currentbal;
	void debit(int num)
	{
		balance=balance-num;
		debitamnt++;
		Ind_debit_amnt++;
		
	}
	void credit(int num)
	{
		balance=balance+num;
		creditamnt++;
		Ind_debit_amnt++;
		
	}
	void Printbal()
	{
		System.out.println("The current bal is "+balance);
		currentbal++;
		Ind_currentbal++;
		
		
	}
	void IndividualTransaction()
	{
		System.out.println("The Individual Transactions are:");
		System.out.println("The debit amount is"+Ind_debit_amnt);
		System.out.println("The credit amount is"+Ind_debit_amnt);
		System.out.println("The current balance is"+Ind_currentbal);
		
		
	}
	void allTransactions()
	{
		System.out.println("The All Transactions are:");
		System.out.println("The debit amount is"+debitamnt);
		System.out.println("The credit amount is"+creditamnt);
		System.out.println("The current balance is"+currentbal);
	}
	void setUserDetails(String Username,int int_bal)
	{
		balance=int_bal;
		System.out.println("The First username is "+Username+" and the current balance is "+int_bal+"");
		System.out.println("The Second username is "+Username+" and the current balance is "+int_bal+"");
	}

	public static void main(String[] args) {
		Assignment13 assignment13 =new Assignment13();
		Assignment13 assignment13_1 =new Assignment13();
		assignment13.setUserDetails("User1",1500);
		assignment13.debit(120);
		assignment13.credit(100);
		assignment13.credit(100);
		assignment13.credit(100);
		assignment13.Printbal();
		assignment13.Printbal();
		assignment13.IndividualTransaction();
		
		assignment13_1.setUserDetails("User2",1900);
		assignment13_1.debit(106);
		assignment13_1.debit(120);
		assignment13_1.debit(10);
		assignment13_1.credit(1300);
		assignment13_1.credit(1300);
		assignment13_1.credit(1300);
		assignment13_1.Printbal();
		assignment13_1.Printbal();
		assignment13_1.Printbal();
		assignment13_1.IndividualTransaction();

		assignment13_1.allTransactions();
		 
		 

	}

}
