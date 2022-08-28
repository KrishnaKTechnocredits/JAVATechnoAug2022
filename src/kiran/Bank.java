package kiran;

class Bank{
	int tm=10000;
	int amt=0;
	
	void debit(){
	tm=tm-1000;
	}
	
	void credit(){
	tm=tm+2000;
	}
	
	public static void main(String args[])
	{
		Bank b1=new Bank();
		Bank b2=new Bank();
		
		b1.credit();
		b2.debit();
		b2.credit();
		b1.credit();
		System.out.println(b1.tm);
	}
}