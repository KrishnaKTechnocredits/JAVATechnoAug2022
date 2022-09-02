/*Assignment - 3 : 22nd Aug'22

Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest to use If condition to make sure asked amount <= balance, if not please print InSufficient fund message in debit method.*/
package adittyThakare.basicconcepts;

class BankDetails{
	int balance = 1000;
	int debitCount = 0;
	int creditCount = 0;
	
	void debitAmount(int amount){
		if(amount<=balance){
			balance = balance - amount;
			debitCount++;
		}else{
			System.out.println("Debit cannot be performed. Insufficient balance!!");
		}
	}

	void creditAmount(int amount){
		balance = balance + amount;
		creditCount++;
	}

	void displayBalance(){
		System.out.println("Current account balance is : "+balance);
		System.out.println("Debit transactions count : "+debitCount);
		System.out.println("Credit transactions count : "+creditCount);
	}

	public static void main(String[] args){
		BankDetails bankDetails = new BankDetails();
		bankDetails.debitAmount(500);
		bankDetails.debitAmount(300);	
		bankDetails.creditAmount(2000);	
		bankDetails.debitAmount(500);
		bankDetails.displayBalance();
		bankDetails.debitAmount(2000);
		bankDetails.displayBalance();
	}
}	