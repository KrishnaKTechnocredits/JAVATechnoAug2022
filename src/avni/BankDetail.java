package avni;

public class BankDetail {

	int balance;
	int creditCount;
	int debitCount;
	static int creditCounts;
	static int debitCounts;
	static int print;

	void userInfo(String name, int amount) {
		amount = balance;
	}

	void debit(int n) {
		balance = balance - n;
		debitCount++;
		debitCounts++;
	}

	void credit(int n) {
		balance = balance + n;
		creditCount++;
		creditCounts++;
	}

	void printSummry() {
		System.out.println("Credit " + creditCount + " times");
		System.out.println("debit " + debitCount + " times");
		System.out.println("balance " + balance);
		print++;
	}

	void totalOp() {
		System.out.println("total credit " + creditCounts + " times");
		System.out.println("total debit " + debitCounts + " times");
		System.out.println("detail prints " + print + " times");
	}

	public static void main(String[] args){
			BankDetail bankDetail1 = new BankDetail();
			BankDetail bankDetail2 = new BankDetail();
			bankDetail1.userInfo("user1" , 1000);
			bankDetail1.credit(10000);
			bankDetail1.debit(9000);
			bankDetail1.credit(1000);
			bankDetail1.printSummry();
			bankDetail2.userInfo("user2",2000);
			bankDetail2.credit(20000);
			bankDetail2.debit(19000);
			bankDetail2.debit(10);
			bankDetail2.credit(1000);
			bankDetail2.credit(100);
			bankDetail2.printSummry();
			bankDetail2.totalOp();
	}
}