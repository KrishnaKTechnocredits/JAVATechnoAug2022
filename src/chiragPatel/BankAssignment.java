package chiragPatel;
class BankAssignment{
	
	int balance = 2000;
	int creditCount;
	int debitCount;
	
	void debitamount(int drAmount)
	{
		if(drAmount<=balance)
	{		
		balance= balance-drAmount;
		debitCount++;
	}
	else
	{
		System.out.println("insufficent balance");
	}
	}
	
	void creditamount(int crAmount){
		balance=balance+crAmount;
		creditCount++;
	}
	
	void printInfo()
	{
		System.out.println("balance " +balance);
		System.out.println("total credit is "+debitCount);
		System.out.println("total debit is "+creditCount);
		
	}
	
	public static void main(String[] args)
	{
		BankAssignment bankassignment = new BankAssignment();
		//bankassignment.debitamount(1000);
		//bankassignment.debitamount(800);
		bankassignment.creditamount(100);
		bankassignment.creditamount(200);
		bankassignment.creditamount(300);
		bankassignment.creditamount(400);
		bankassignment.printInfo();
	}
	}
