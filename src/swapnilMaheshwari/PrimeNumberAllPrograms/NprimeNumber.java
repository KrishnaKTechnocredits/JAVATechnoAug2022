package swapnilMaheshwari.PrimeNumberAllPrograms;

public class NprimeNumber {
	int index=2;
	void primeCheck(int num) {
		boolean flag=true;
		int count=0;
		while (count<num){  
			for (int i=2; i<index;i++) {
				
			if (index%i==0)
			{
				flag= false;
				break;
			}
		}
			if (flag==true)
			{
				System.out.println("First " +num+ " Prime number are "+index);
				count++;
			}
			index++;
			flag=true;
		
	}
}
	public static void main (String[] args) {
		//NprimeNumber nprimeNumbernew = new NprimeNumber();
		new NprimeNumber().primeCheck(5);
	}
}
