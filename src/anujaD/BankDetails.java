package anujaD;

class BankDetails{
	
	int balance = 1000;
	int debitcount;
	int creditcount;

			void debitInfo(int debitAmount)
			{
				if(debitAmount <= balance)
				{
					balance = balance - debitAmount;
					debitcount++;
					
				}else
				{
					System.out.println("Insufficient Fund");
				}
				
			}
			void creditInfo(int creditAmount)
			{
				balance = balance + creditAmount;
				creditcount++;
				
			}
			void printInfo()
			{
			
				System.out.println("Your Current Balance is: "  +balance);
				System.out.println("Total Debit operation performed: "  +debitcount);
				System.out.println("Total credit operation performed: "  +creditcount);
			}
		
			public static void main (String[] args)
			{
				BankDetails bankDetails = new BankDetails();
					bankDetails.debitInfo(500);
					bankDetails.creditInfo(200);
					bankDetails.creditInfo(100);
					bankDetails.debitInfo(300);
					bankDetails.debitInfo(4500);
					bankDetails.printInfo();
					
			}
}