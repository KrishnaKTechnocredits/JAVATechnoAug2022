package hardikBhatia;

public class Bank {
	int totalDebit = 0; 
	int totalCredits = 0;
	int currentBalance = 3000;
	
	void debitAmount(){
		if(currentBalance <= 1500){
			System.out.println("InSufficient fund ");
		}
		else{
			currentBalance = currentBalance - 1500;
			totalDebit++;
		}
	}
	void creditAmount(){
		currentBalance = currentBalance + 2000;
		totalCredits++;
	}
	void printInfo(){
		System.out.println("Total Debit Count is : "+ totalDebit);
		System.out.println("Total Credit Count is : "+ totalCredits);
		System.out.println("Total Balance is : "+ currentBalance);
	}
	
	public static void main(String[] args){
		Bank bank  = new Bank();
		bank.debitAmount();
		bank.debitAmount();
		bank.printInfo();
		bank.creditAmount();
		bank.creditAmount();
		bank.printInfo();
	}
}
