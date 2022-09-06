package saroj;

public class BankingSystemUpdated {

	static int allDebitCount;
	static int allCreditCount;
	static int allPrintCount;
	int indiCrditCount, indiDebitCount, indiCount, currentBal;
	String name;

	void setUserDetails(int currentBal, String name) {
		this.currentBal = currentBal;
		this.name = name;
	}

	void debitAmount(int amt) {
		if (amt <= currentBal) {
			currentBal = currentBal - amt;
		} else {
			System.out.println(name + " having insufficent balance");
		}
		indiDebitCount++;
		allDebitCount++;
	}

	void crditAmount(int amt) {
		currentBal = currentBal + amt;
		indiCrditCount++;
		allCreditCount++;
	}

	void printBalance() {
		System.out.println(name + " current balance is:" + currentBal);
		indiCount++;
		allPrintCount++;
	}

	void individualTransactionSummary() {
		System.out.println(name + " transaction summary :Credit-" + indiCrditCount + "times, Debit-" + indiDebitCount
				+ " times, printBalance-" + indiCount + " time");
	}

	static void allTransactionSummary() {
		System.out.println("All transaction summary :Credit-" + allCreditCount + " times,Debit-" + allDebitCount
				+ " times, printBalance-" + allPrintCount + " time");
	}

	public static void main(String[] args) {
		BankingSystemUpdated bankingSystemUpdated1 = new BankingSystemUpdated();
		BankingSystemUpdated bankingSystemUpdated2 = new BankingSystemUpdated();

		bankingSystemUpdated1.setUserDetails(15000, "Saroj");
		bankingSystemUpdated1.debitAmount(2000);
		bankingSystemUpdated1.debitAmount(5000);
		bankingSystemUpdated1.crditAmount(3000);
		bankingSystemUpdated1.printBalance();
		bankingSystemUpdated1.individualTransactionSummary();

		bankingSystemUpdated2.setUserDetails(25000, "Sansu");
		bankingSystemUpdated2.debitAmount(12000);
		bankingSystemUpdated2.debitAmount(5000);
		bankingSystemUpdated2.crditAmount(3000);
		bankingSystemUpdated2.crditAmount(5000);
		bankingSystemUpdated2.printBalance();
		bankingSystemUpdated2.individualTransactionSummary();
		allTransactionSummary();

	}
}
