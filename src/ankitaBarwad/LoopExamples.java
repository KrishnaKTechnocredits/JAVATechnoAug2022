package ankitaBarwad;

class LoopExamples{
	
	void findEvenNumber(int startIndex, int endIndex){
		System.out.println("Even numbers between " + startIndex +" and " + endIndex + " are:");		
		for(int index=startIndex; index<=endIndex; index++){
			if(index%2 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divBy5(int startIndex, int endIndex){
		System.out.println("Numbers divisible between "+ startIndex + " and " + endIndex + " by 5 are");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divBy5_3(int startIndex, int endIndex){
		System.out.println("Numbers divisible between "+ startIndex + " and " + endIndex + " by 3 and 5 are");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5 == 0 && index%3 == 0){
				System.out.println(index);
			}
		}
	}
	
	void divBy7_13(int startIndex, int endIndex){
		System.out.println("Numbers divisible between "+ startIndex + " and " + endIndex + " by 7 and 13 are");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7 == 0){
				System.out.println(index + " is divisible by 7");
			}
			else if(index%13 == 0){
				System.out.println(index + " is divisible by 13");
			}
		}
	}
	
	void sum(int startIndex,int endIndex){
		int total=0;
		for(int index=startIndex;index<=endIndex;index++){
			total = total + index;
		}
		System.out.println("Sum is "+ total);
	}
	
	void difference(int startIndex,int endIndex){
		int even=0;
		int odd =0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0)
				even=even+index;
			else
				odd=odd+index;
		}
		System.out.println("Difference is "+(odd-even));
	}
	
	void reverse(int startIndex, int endIndex){
		System.out.println("Reverse Output of odd numbers between " + startIndex + " and " + endIndex);
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		LoopExamples loopExample = new LoopExamples();
		loopExample.findEvenNumber(10,15);
		loopExample.divBy5(10,30);
		loopExample.divBy5_3(5,18);
		loopExample.divBy7_13(5,40);
		loopExample.sum(1,5);
		loopExample.difference(3,9);
		loopExample.reverse(10,20);
	}
}