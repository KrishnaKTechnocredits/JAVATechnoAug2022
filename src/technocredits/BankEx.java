package technocredits;

public class BankEx {
	int balance = 10000;
	static int creditCount;
	static int debitCount;
	int iCreditCount;
	int iDebitCount;
	
	void debitOp() {
		debitCount++;
		iDebitCount++;
	}
	
	void creditOp() {
		creditCount++;
	}
	
	void summary() {
		
	}
	
    void iSummary() {
		
	}
	
	public static void main(String[] args) {
		BankEx ex1 = new BankEx();
		BankEx ex2 = new BankEx();
		
		ex2.iSummary();
	}
}
