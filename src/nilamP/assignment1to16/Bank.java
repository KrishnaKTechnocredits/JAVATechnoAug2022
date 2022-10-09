
/*Assignment - 3 : 22nd Aug'22
Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method.
*/

package nilamP.assignment1to16;
public class Bank {
	int balance = 10000;
	int debitCount = 0;
	int creditCount = 0;

	void creditAmount(int amount) {
		balance += amount;
		creditCount++;
	}

	void debitAmount(int Amount) {
		if (Amount <= balance) {
			balance -= Amount;
			debitCount++;
		} else {
			System.out.println("Insufficient Balance to debit rupees; " + Amount);
		}
	}

	void printInfo() {
		System.out.println("Remaining Balance is : " + balance);
		System.out.println("Credit Count is : " + creditCount);
		System.out.println("Debit Count is : " + debitCount);
	}

	public static void main(String[] args) {
		Bank b = new Bank();
System.out.println("Assignment 3 output :");
		b.creditAmount(8000);
		b.debitAmount(500);
		b.debitAmount(200);
		b.creditAmount(450);
		b.creditAmount(250);
		b.creditAmount(3000);
		b.debitAmount(7000);
		b.printInfo();
	}
}


