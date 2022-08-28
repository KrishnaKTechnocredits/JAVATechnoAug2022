package pranjaliV;

class LoopEx5{
	
	void evenNum(int startIndex, int endIndex){
		System.out.println("Even numbers between " + startIndex + " and " + endIndex + " are:");
		for(int index = startIndex; index<=endIndex; index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	void div5(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 between " + startIndex + " and " + endIndex + " are:");
		for(int index = startIndex; index<=endIndex; index++){
			if(index%5==0){
				System.out.println(index);
			} 
		}
	}
	
	void div5and3(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 3 and 5 between " + startIndex + " and " + endIndex + " are:");
		for(int index = startIndex; index<=endIndex; index++){
			if(index%3==0 && index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void div7and13(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 between " + startIndex + " and " + endIndex + " are:");
		for(int index =startIndex; index<=endIndex; index++){
			if(index%7==0 || index%13==0){
				if(index%7==0){
					System.out.println(index + " is divisible by 7");
				}
				else{
					System.out.println(index + " is divisible by 13");
				}
			}
		}
	}
	
	void sum(int startIndex, int endIndex){
		int add=0;
		for(int index = startIndex; index<=endIndex; index++){
			add = add + index;
		}
		System.out.println("Sum is " + add );
	}
	
	void diffEvenOdd(int startIndex, int endIndex){
		int sumOdd = 0;
		int sumEven =0;
		for(int index = startIndex; index<=endIndex; index++){
			if(index%2==0){
				sumEven = sumEven + index;
			}//even
			else{
				sumOdd = sumOdd + index;
			}//odd
		}
		System.out.println("Difference between sum of odd numbers and even numbers between the range " + startIndex + " and " + endIndex + " is : " + (sumOdd-sumEven));
	}
	
	void odd(int startIndex, int endIndex){
		System.out.println("Odd numbers in reverse order between " + startIndex + " and " + endIndex + " are : ");
		for(int index = endIndex; index>=startIndex; index--){
			if(index%2!=0){
				System.out.println(index);
			}
		}
	}
	
	public static void main(String[] args){
		LoopEx5 loopEx5 = new LoopEx5();
		loopEx5.evenNum(10,15);
		loopEx5.div5(10,30);
		loopEx5.div5and3(5,18);
		loopEx5.div7and13(5,40);
		loopEx5.sum(1,5);
		loopEx5.diffEvenOdd(3,9);
		loopEx5.odd(10,20);
	}
}