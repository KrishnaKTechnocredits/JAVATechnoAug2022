package pujaSah.sssignments1_10;

public class InitialAssignmentBankDetail {
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
		InitialAssignmentBankDetail initialAssignmentBankDetail = new InitialAssignmentBankDetail();
		initialAssignmentBankDetail.debitAmt(2000);
		initialAssignmentBankDetail.creditAmt(5000);
		initialAssignmentBankDetail.debitAmt(1000);
		initialAssignmentBankDetail.creditAmt(10000);
		initialAssignmentBankDetail.creditAmt(10000);
		initialAssignmentBankDetail.debitAmt(1000);
		initialAssignmentBankDetail.debitAmt(1000);
		initialAssignmentBankDetail.debitAmt(1000);
		initialAssignmentBankDetail.printInfo();
	}

}
