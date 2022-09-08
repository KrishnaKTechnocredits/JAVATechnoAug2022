package monikaDwivedi;
//Assignment - 3 : 22nd Aug'22

//Create a class called Bank having 3 methods and 3 instance variables.
//- expected operations - debitAmount, creditAmount, printInfo.
//- print info should print total debit operation, total credits operations and current balance.
//- variable balance to hold current balance, creditCount, debitCount.
//- create only one object and call methods multiple times, at the end call printInfo method.
//- I suggest to use If condition to make sure asked amount <= balance, if not please print InSufficient fund message in debit method.


class Bank{
	int credit;
	int debit;
	int balance = 10000;
	
	void creditAmount(int creditAmount){
		balance = balance+creditAmount;
		credit++;	
	}
	
	void debitAmount(int debitAmount){
		balance = balance - debitAmount;
		debit++;
	}
	
	void printInfo(){
		
		System.out.println("Total amount in your account is = " + balance);
		System.out.println("credited "+credit+" times");
		System.out.println("debited "+debit+" times");		
	}
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.creditAmount(400);
		bank.creditAmount(600);
		bank.debitAmount(600);
		
		bank.printInfo();
	}
}