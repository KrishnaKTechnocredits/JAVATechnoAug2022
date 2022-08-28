package smitaVetal;

class Loop{

	void evenNum(int start,int end){
		System.out.println("Even numbers between "+start+" and "+end+" are ");
		for(int index=start;index<=end;index++){
			if(index%2==0)
				System.out.println(index);			
		}
	}		
	void div5(int start,int end){
		System.out.println("Numbers Divisible by 5 from range "+start+" to "+end+" are ");
		for(int index=start;index<=end;index++){
			if(index%5==0)
				System.out.println(index);
		}
	}	
	void div35(int start,int end){
		System.out.println("Number divisible by 3 and 5 from range " +start+" to "+end+" are ");
		for(int index=start;index<=end;index++){
			if(index%3==0 && index%5==0)
				System.out.println(index);
		}
	}
	void div713(int start,int end){
		System.out.println("Numbers divisible by 7 or 13 from range 5 to 40 are ");
		for(int index=start;index<=end;index++){
				if(index%7==0)
				System.out.println(index + " is divisible by " + 7);
			else if(index%13==0)
				System.out.println(index+ " is divisible by "+ 13);		
			}
	}
	void sum(int start, int end){
		int num=0;
		{	for(int index=start;index<=end;index++)
				num = num+index;
				System.out.println("Sum of all numbers from range " +start+ " to " +end+ " is " +num);
		}
	}
	void diff(int start,int end){
		int even=0;
		int odd=0;
		for(int index=start;index<=end;index++){
			if(index%2==0)
				even=even+index;
			else
				odd=odd+index;
		}
			System.out.println("Sum of odd and even numbers from range " +start+ " to "+ end+ " is " +(odd-even));
	}
	void reverse(int start,int end){
		System.out.println("Odd Numbers in reverse order from range "+start+" to "+end+" is");
		for(int index=end;index>=start;index--){
			if(index%2!=0)		
			{
			System.out.println(index);
			}
		}
	} 	
	public static void main(String[]args){
		Loop loop=new Loop();
		loop.evenNum(10,15);
		loop.div5(10,30);
		loop.div35(5,18);
		loop.div713(5,40);
		loop.sum(1,5);
		loop.diff(3,9);
		loop.reverse(10,20);
	}
}