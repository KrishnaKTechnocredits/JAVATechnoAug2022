package shivaniLikhia;
class Bank{

	int balance = 1000;
	
	void debitAmt(){
		int balance = 3000;
		balance = balance - 2500;
		System.out.println(balance);
	}
	
	void display(){
		System.out.println(balance);
	}
	
	public static void main(String[] args){
		Bank bank = new Bank();
		bank.debitAmt();
		bank.display();
	}
}