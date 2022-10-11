
/*Assignment - 3 : 22nd Aug'22
Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method.*/

package namratamishra.Basic_Operations;
class Bank {

	int balance = 1200, debitCount = 0, creditCount = 0;

	void debitAmount(int debAmt) {
		if (balance < debAmt)
			System.out.println(" Insufficient Fund");

		else {
			balance = balance - debAmt;
			debitCount++;
		}

	}

	void creditAmount(int creAmt) {

		balance = balance + creAmt;
		creditCount++;
	}

	void printInfo() {
		System.out.println(" Total no. of debit operation is : " + debitCount);
		System.out.println(" Total no. of credit operation is : " + creditCount);
		System.out.println(" current balance is: " + balance);

	}

	public static void main(String[] args) {
		Bank b = new Bank();
		b.debitAmount(1300);
		b.debitAmount(100);
		b.creditAmount(100);
		b.creditAmount(100);
		b.printInfo();

	}
}
