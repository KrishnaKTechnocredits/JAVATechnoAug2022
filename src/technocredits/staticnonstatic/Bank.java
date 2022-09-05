package technocredits.staticnonstatic;

public class Bank {
	static int totalDebit;
	
	void debitAmt() {
		totalDebit++;
	}
	
	void printData() {
		System.out.println(totalDebit);
	}
	
	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.debitAmt();
		user1.debitAmt();
		
		Bank user2 = new Bank();
		user2.debitAmt();
		
		user1.printData(); // 2
		user2.printData(); // 1
	}
}
