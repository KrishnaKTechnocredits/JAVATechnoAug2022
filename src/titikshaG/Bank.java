package titikshaG;
class Bank
{
	int balance=5000;
	void tax()
{
		//int bal=600;
		balance=balance-20;
		System.out.println(balance);
}
	void display()
{
		System.out.println(balance);
}
	public static void main(String[] args)
{
		Bank bank=new Bank();
		bank.display();
		bank.tax();
}
}