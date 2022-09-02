package pujaSah.assignments11_20;

public class UserBankDetails {
	int balance;
	String name;
	int debitCount = 0;
	int creditCount = 0;
	static int commonBalance;
	static int commonDebitCount = 0;
	static int commonCreditCount = 0;

	void debitAmount(int amount) {
		this.balance = this.balance - amount;
		this.debitCount++;
		commonDebitCount++;
	}

	void creditAmount(int amount) {
		this.balance = this.balance + amount;
		this.creditCount++;
		commonCreditCount++;
	}

	void showIndividualTransactionSummary() {
		System.out.println("The number of debit and credit operations performed by " + this.name + " is  "
				+ this.debitCount + " and " + this.creditCount + " respectively.");
		System.out.println("Remaining balance for " + this.name + " is  " + this.balance);
	}

	public static void main(String[] args) {
		UserBankDetails userBankDetails1 = new UserBankDetails();
		UserBankDetails userBankDetails2 = new UserBankDetails();

		userBankDetails1.balance = 100000;
		userBankDetails2.balance = 100000;

		userBankDetails1.name = "Priya Singh";
		userBankDetails2.name = "Soma Singh";

		userBankDetails1.debitAmount(10000);
		userBankDetails1.debitAmount(10000);
		userBankDetails1.debitAmount(10000);
		userBankDetails1.creditAmount(40000);
		userBankDetails1.creditAmount(10000);

		userBankDetails2.debitAmount(50000);
		userBankDetails2.debitAmount(10000);
		userBankDetails2.creditAmount(20000);

		userBankDetails1.showIndividualTransactionSummary();
		userBankDetails2.showIndividualTransactionSummary();

		System.out.println("Total number of debit operations performed : " + commonDebitCount);
		System.out.println("Total number of credit operations performed :" + commonCreditCount);

		commonBalance = userBankDetails1.balance + userBankDetails2.balance;
		System.out.println("Remaining balance for both users: " + commonBalance);
	}
}
