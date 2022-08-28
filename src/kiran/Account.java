package kiran;


class Account{
	String accname= "Gaurav kumar Sahu";
	int balance=10000;
	
	void balance(){
		int balance=5000;
		String accname="Garvis";
		System.out.println(balance);
		System.out.println(accname);	
	}
	
	void statement(){
		String accname="Raju";
		System.out.println(accname);
		System.out.println(balance);	
	}
	
	void loan(){
		int loan=50000000;
		System.out.println("loan amount is "+loan);	
	}

	public static void main(String [] args){
		Account account=new Account();
		account.balance();
		account.statement();
		account.loan();
	}
}