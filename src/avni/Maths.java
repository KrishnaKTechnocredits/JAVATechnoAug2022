//assignment7
//AVANI DALSANIYA
package avni;
class Maths{
	void even(int start,int end){
		System.out.println("1.even numbers are");
		for(int i=start;i<=end;i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	void div(int start,int end){
		System.out.println("2.numbers divisible by 5 are"); 
		for(int i=start;i<=end;i++){
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void division(int start,int end){
		System.out.println("3.Divisible by 5&3,numbers are");
		for(int i=start;i<=end;i++){
			if(i%5==0 && i==5)
				System.out.println(i);
		}
	}
	
	void divisible(int start,int end){
		System.out.println("4.Divisible by 7 or 13, numbers are");
		for(int i=start;i<=end;i++){
			if(i%7==0)
				System.out.println(i+"is divisible by 7");
			if(i%13==0)
				System.out.println(i+" is divisible by 13");
		}
	}
	
	void sum(int start,int end){
		int sum=0;
		for(int i=start;i<=end;i++){
			sum+=i;
		}
		System.out.println("5.sum is "+sum);
	}
	
	void differance(int start,int end){
		int even=0;
		int odd=0;
		for(int i=start;i<=end;i++){
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("6.differance between sum of odd and even is "+(even-odd));
	}
	
	void odd(int start,int end){
		System.out.println("7.odd numbers are");
		for(int i=end;i>=start;i--){
			if(i%2==1)
				System.out.println(i);
		}
	}
	
	
	public static void main(String[] args){
		Maths maths=new Maths();
		maths.even(10,15);
		maths.div(10,30);
		maths.division(5,18);
		maths.divisible(5,40);
		maths.sum(10,20);
		maths.differance(1,12);
		maths.odd(10,50);
	}
}	
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	

	