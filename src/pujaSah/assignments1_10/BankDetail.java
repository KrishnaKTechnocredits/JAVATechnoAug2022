package pujaSah.assignments1_10;

public class BankDetail {
	int balance = 10000;
	int debitCount = 0;
	int creditCount = 0;

	void debitAmt(int amt) {
		if (amt <= balance) {
			balance = balance - amt;
			debitCount++;
		} else
			System.out.println("Insufficient fund");
	}

	void creditAmt(int amt) {
		balance = balance + amt;
		creditCount++;
	}

	void printInfo() {
		System.out.println("Now your balance is " + balance);
		System.out.println("Total debit operation " + debitCount);
		System.out.println("Total credit operation " + creditCount);
	}

	public static void main(String[] args) {
		BankDetail bankDetail = new BankDetail();
		bankDetail.debitAmt(2000);
		bankDetail.creditAmt(5000);
		bankDetail.debitAmt(1000);
		bankDetail.creditAmt(10000);
		bankDetail.creditAmt(10000);
		bankDetail.debitAmt(1000);
		bankDetail.debitAmt(1000);
		bankDetail.debitAmt(1000);
		bankDetail.printInfo();
	}

}
