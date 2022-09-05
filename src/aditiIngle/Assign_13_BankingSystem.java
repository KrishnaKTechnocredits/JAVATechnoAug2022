package aditiIngle;
class Assign_13_BankingSystem{
	static int balance =10000;
	int credit, debit, printBalance;
	static int s_credit, s_debit,s_printBalance;
	void debitAmount(int num1){
		balance=balance-num1;
		debit++;
		s_debit++;
	}
	void creditAmount(int num1){
		balance=balance+num1;
		credit++;
		s_credit++;
	}
	void printBalance(){
		System.out.println("Current balance: " + balance);
		printBalance++;
		s_printBalance++;
	}
	void IndividualTransactionSummary1(){
		System.out.println("User 1 Transaction summary: "+" Credit: "+credit+" Debit: "+debit+" printBalance: "+printBalance);
	}
	void IndividualTransactionSummary2(){
		System.out.println("User 2 Transaction summary: "+" Credit: "+credit+" Debit: "+debit+" printBalance: "+printBalance);
	}
	static void allTransactionSummary(){
		System.out.println("All transaction summary: "+" Credit: "+s_credit+" Debit: "+s_debit+" printBalance: "+s_printBalance);
	}
	
	public static void main(String[] args){
		Assign_13_BankingSystem user1 = new Assign_13_BankingSystem();
		Assign_13_BankingSystem user2 = new Assign_13_BankingSystem();
		user1.creditAmount(1000);
		user1.creditAmount(1000);
		user1.debitAmount(1000);
		
		user2.creditAmount(500);
		user2.debitAmount(500);
		user2.creditAmount(1000);
		user2.debitAmount(500);
		user2.creditAmount(500);
		user2.creditAmount(1000);
		user2.creditAmount(500);
		user1.printBalance();
		user1.IndividualTransactionSummary1();
		user2.IndividualTransactionSummary2();
		
		allTransactionSummary();
	}
}