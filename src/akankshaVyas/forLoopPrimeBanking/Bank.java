/* Assignment - 3 : 22nd Aug'22

Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest to use If condition to make sure asked amount <= balance, if not please print InSufficient fund message in debit method.
*/
package akankshaVyas.forLoopPrimeBanking;
class Bank{

	int balance = 10000;
	int creditCount;
	int debitCount;
	
	void debit(int amount){
		if(amount<=balance){
		balance=balance-amount;
		debitCount++;
		}else{
			System.out.println("Insufficient fund");
			}
	}
	
	void credit(int amount){
		balance=balance+amount;
		creditCount++;
	}
	
	void printInfo(){
		System.out.println("Current balance is " + balance);
		System.out.println("Total debit operation " + debitCount);
		System.out.println("Total credits operations " + creditCount);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debit(10050);
		bank.debit(1000);
		bank.printInfo();
		bank.debit(500);
		bank.printInfo();
		bank.credit(1000);
		bank.credit(1000);
		bank.printInfo();
		}
}