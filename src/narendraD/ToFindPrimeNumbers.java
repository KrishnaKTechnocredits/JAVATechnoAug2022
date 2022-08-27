package narendraD;

class ToFindPrimeNumbers {
	
	void getPrimeNumbers(int enternumber) {
		boolean flag=true;
		for(int index=2; index<enternumber/2; index++)
		{
			if (enternumber%index==0 && enternumber>1)
			{
				System.out.println(enternumber +" is not a prime number");
				flag = false;
				//System.out.println(flag);
				break;
			}   
		}
		if (flag==true && enternumber>1)
		{
			System.out.println(enternumber +" is a prime number");
		}
		else if (enternumber==1)
		{
			System.out.println(enternumber +" is not a prime number");
			
		}
		else if(enternumber<1)
		{
			System.out.println(enternumber +" is a invalid number");
		}
		
	}
		
	public static void main(String[] args) {
		ToFindPrimeNumbers tofindprimenumbers = new ToFindPrimeNumbers();
		tofindprimenumbers.getPrimeNumbers(15);
		tofindprimenumbers.getPrimeNumbers(17);
		tofindprimenumbers.getPrimeNumbers(113);
		tofindprimenumbers.getPrimeNumbers(-91);
		tofindprimenumbers.getPrimeNumbers(3);
		tofindprimenumbers.getPrimeNumbers(2);
		tofindprimenumbers.getPrimeNumbers(1);
		tofindprimenumbers.getPrimeNumbers(0);
		//tofindprimenumbers.getPrimeNumbers(0.5);
		tofindprimenumbers.getPrimeNumbers(-1);
	}

}