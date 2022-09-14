package sanket;


public class BankFacility{
	
	static int debitCount;
	static int creditCount;
	static int printCount;
	static int balance;
	int iDebitCount;
	int iCreditCount;
	int iprintCount;
	
	void userNameDetails(String user, int bal){
		 balance=bal;
		 iDebitCount=0;
		 iCreditCount=0;
		 iprintCount=0;
		System.out.println(""+user+" have initial balance "+balance+"." );
	}
	
	void debitAmt(int Amt){
		if(Amt<=balance){
			balance = balance - Amt;
			iDebitCount++;
			debitCount++;
		} else {
			System.out.println("Insufficient Fund.");
		}
	}
		void creditCount(int Amt){
			balance = balance + Amt;
			iCreditCount++;
			creditCount++;
		}
		
		void printBalace(){
			printCount++;
			iprintCount++;
			System.out.println("Your available balance is "+balance+".");
		}	

	void indivisualTransactionSummaryUser(){
		System.out.println("Indivisual transaction is credit count "+iCreditCount+", debit count "+iDebitCount+", and print balance is "+iprintCount+"." + "\n");
	}	
	void allTransactionSummary(){
		System.out.println("All transaction Summary for both users are credit count "+creditCount+", debit count "+debitCount+", print balance is "+printCount+".");
	}
	
	public static void main(String[] args){
		
		BankFacility bankFacility1 = new BankFacility();
		BankFacility bankFacility2 = new BankFacility();
		bankFacility1.userNameDetails("USER1", 1000);
		bankFacility1.debitAmt(60);
		bankFacility1.creditCount(60);
		bankFacility1.debitAmt(80);
		bankFacility1.printBalace();
		bankFacility1.indivisualTransactionSummaryUser();
		System.out.println("***************************************************************" + "\n");
		bankFacility2.userNameDetails("USER2", 2000);
		bankFacility2.debitAmt(60);
		bankFacility2.debitAmt(70);
		bankFacility2.creditCount(60);
		bankFacility2.debitAmt(80);
		bankFacility2.indivisualTransactionSummaryUser();
		System.out.println("***************************************************************");
		bankFacility1.allTransactionSummary();
	}	
}

