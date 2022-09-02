package titikshaG;

public class Banking {
int debit;
int credit;
static int balance;
int bal=10000;
static int totaldebit;
static int totalcredit;

	void debitCount(int amount)
		{
		bal=bal-amount;
		debit++;
		totaldebit++;
		}
	void creditCount(int amount)
		{
		bal=bal+amount;
		credit++;
		totalcredit++;
		}
	void printBalance()
		{
		System.out.println("total balance is" +" "+ bal);
		balance++;
		}
	void individualTransaction()
		{
		System.out.println("Customer number of times amount debited is" +" "+ debit);
		System.out.println("Customer number of times amount credited is"+" " +credit);
		}
	void finalBalance()
		{
		balance=debit-credit;
		}
	void totalTransaction()
		{
		System.out.println("Total number of amount debited is : " + totaldebit);
		System.out.println("Total number of amount credited is : " + totalcredit);
		System.out.println("Total balance is : " + balance);
		
		}
	public static void main(String[] a)
		{
		Banking banking=new Banking();
		banking.debitCount(11001);
		banking.creditCount(500);
		banking.creditCount(500);
		banking.printBalance();
		banking.individualTransaction();
		System.out.println();
		
		Banking banking2=new Banking();
		banking2.debitCount(12000);
		banking2.debitCount(500);
		banking2.creditCount(500);
		banking2.creditCount(500);
		banking2.creditCount(500);
		banking2.creditCount(500);
		banking2.creditCount(500);
		banking2.printBalance();
		banking2.individualTransaction();
		System.out.println();
		banking.finalBalance();
		banking.totalTransaction();
		}
	
}
	

