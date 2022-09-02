package manjiri;

public class BankingSys {
	static int balance;
	static int debitcnt;
	static int creditcnt;
	static int printBalancecnt;
	static String usrname;
	int idebitcnt;
	int icreditcnt;
	int iprintBalancecnt;
	
	void debitOpr(int num) {
		balance =  balance - num;
		idebitcnt ++;
		debitcnt++;
	}
	
	void creditOpr(int num) {
		balance =  balance + num;
		icreditcnt++;
		creditcnt++;
	}
	
	void printBalance() {
		System.out.println(usrname+": "+"your available balance is: "+ balance);
		iprintBalancecnt++;
		printBalancecnt++;
	}
	
	void individualTransactionSummary() {
		System.out.println("---- Indivisual Transaction Summary ----");
		System.out.println("Number of debit operations: "+ idebitcnt);
		System.out.println("Number of credit operations: "+ icreditcnt);
		System.out.println("Number of times balance is printed: "+ iprintBalancecnt);
	}
	
	void setUserDetails(String name, int bal) {
		balance = bal;
		usrname = name;
	}
	
	void allTransactionSummary() {
		System.out.println("---- All Transaction Summary ----");
		System.out.println("Number of debit operations: "+ debitcnt);
		System.out.println("Number of credit operations: "+ creditcnt);
		System.out.println("Number of times balance is printed: "+ printBalancecnt);
	}
	
	public static void main(String[] args) {
		BankingSys bankingSys =  new BankingSys();
		bankingSys.setUserDetails("Manjiri", 10000);
		bankingSys.debitOpr(500);
		bankingSys.debitOpr(200);
		bankingSys.creditOpr(1000);
		bankingSys.printBalance();
		bankingSys.individualTransactionSummary();
		
		BankingSys bankingSys2 =  new BankingSys();
		//bankingSys2.setUserDetails("Manjiri-jointAccount", 10000);
		bankingSys2.debitOpr(500);
		bankingSys2.debitOpr(500);
		bankingSys2.debitOpr(500);
		bankingSys2.debitOpr(500);
		bankingSys2.debitOpr(200);
		bankingSys2.creditOpr(1000);
		bankingSys2.creditOpr(1000);
		bankingSys2.printBalance();
		bankingSys2.printBalance();
		bankingSys2.individualTransactionSummary();
		
		bankingSys.allTransactionSummary();
		bankingSys2.allTransactionSummary();
	}
}
