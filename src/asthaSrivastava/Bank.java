package asthaSrivastava;

public class Bank{
	int balance = 1000;
	void debitAmount() {
		int balance = 3000;
		balance = balance - 2000;
		System.out.println(balance);
	}
	void display(){
		System.out.println(balance);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.debitAmount();
		bank.display();
	}
}