package deepakPatil;

class Bank {

	int balance;
	int creditCount;
	int debitCount;

	void creditAmount(int amt) {
		if (amt <= 0) {
			System.out.println("You can not credit " + amt + " amount to your account.");
		} else {
			balance = balance + amt;
			System.out.println(amt + " has been crdited to your account. Your account balance is " + balance + ".");
			creditCount++;
		}
	}

	void debitAmount(int amt) {
		if (amt <= balance) {
			balance = balance - amt;
			System.out.println(amt + " has been debited from your account. Your account balance is " + balance + ".");
			debitCount++;
		} else {
			System.out.println("You have insufficient funds to debit amount.");
		}
	}

	void printInfo() {
		System.out.println("\n");
		System.out.println("Your account balance is " + balance + ".");
		System.out.println("Total credit operations performed on your account is " + creditCount + ".");
		System.out.println("Total debit operations performed on your account is " + debitCount + ".");
		System.out.println("\n");
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.creditAmount(15000);
		bank.debitAmount(3000);
		bank.debitAmount(8000);
		bank.debitAmount(11000);
		bank.creditAmount(1000);
		bank.debitAmount(3000);
		bank.creditAmount(0);
		bank.printInfo();
	}
}