package shubhamG.Assignment1to10;

/*
Assignment - 3 : 22nd Aug'22
Create a class called Bank having 3 methods and 3 instance variables.
- expected operations - debitAmount, creditAmount, printInfo.
- print info should print total debit operation, total credits operations and current balance.
- variable balance to hold current balance, creditCount, debitCount.
- create only one object and call methods multiple times, at the end call printInfo method.
- I suggest using the If condition to make sure the asked amount <= balance, if not please print InSufficient fund message in debit method.
*/

class Bank{
	int balance = 20000;
	int debitCnt = 0; 
	int creditCnt = 0;
	
	void debitAmount(int amt){
			if (amt<=balance)
				{
					balance = balance-amt;
					debitCnt++;
				}
			else
				{
					System.out.println("Insufficient Funds");
				}
		}

	void creditAmount(int amt){
		balance = balance+amt;
		creditCnt++;
	 }
	
	void printInfo(){
			System.out.println("Current Balance is : " + balance);
			System.out.println("Toal Debit operations performed are : " +debitCnt);
			System.out.println("Toal Credit operations performed are : " +creditCnt);
		}

	public static void main(String[] args ){
	
		Bank bank = new Bank();
		
		bank.debitAmount(500);
		bank.creditAmount(890);
		bank.debitAmount(5000);
		bank.creditAmount(1723);
		bank.debitAmount(5034); 	
		bank.creditAmount(5001);
		bank.debitAmount(500);
		bank.printInfo();
	}
}