package kiran;

public class Prime {
	void isPrimeNum(int num) {
		int count=0;
		if(num<=1)
			System.out.println(num+" not valid number");
		else {
		for(int i=2; i<num; i++)
	      {
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println(num+" It is a Prime Number.");
	      else
	         System.out.println(num+" It is not a Prime Number.");
	}
	}

	public static void main(String[] args) {
		Prime obj=new Prime();
		obj.isPrimeNum(15);
		obj.isPrimeNum(17);
		obj.isPrimeNum(-90);

	}

}
