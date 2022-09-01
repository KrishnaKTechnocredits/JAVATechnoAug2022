package aishwaryaPawar;

class Assignment{
	
	void evenValu(int startValue, int endValu){
		System.out.println("Range -> "+startValue+" to "+endValu);
		System.out.println("\nEven numbers are:");
		for(int index=startValue;index<=endValu;index++){
			if(index%2==0){
				System.out.println(index);
			}
		}
	}
	
	void div5(int startValue, int endValu){
		System.out.println("Range -> "+startValue+" to "+endValu);
		System.out.println("\nDivisible by 5, numbers are:\n");
		for(int index=startValue;index<=endValu;index++){
			if(index%5==0){
				System.out.println(index);
			}
		}
	}
	
	void div53(int startValue, int endValu){
		System.out.println("Range -> "+startValue+" to "+endValu);
		System.out.println("\nDivisible by 5 & 3, numbers are:");
		for(int index=startValue;index<=endValu;index++){
			if(index%5==0 && index%3==0){
				System.out.println(index);
			}
		}
	}
	
	
	void div713(int startValue, int endValu){
		System.out.println("Range -> "+startValue+" to "+endValu);
		System.out.println("\nDivisible by 7 or 13, numbers are:");
		for(int index=startValue;index<=endValu;index++){
			if(index%7==0 && index%13==0){
				System.out.println(index+"is divisible by 7 and 13");
			}else if(index%7==0){
				System.out.println(index+"is divisible by 7");
		    }else if(index%13==0){
				System.out.println(index+"is divisible by 13");
		    }
	    }
	}
	
	void sum(int startValue,int endValu){
		int num=0;
		for(int index=startValue;index<=endValu;index++){
			num = num + index;
			
		}
		System.out.println("\nsum is "+num);
	}
	
	void diffEvnOdd(int startValue,int endValu){
		int sum=0;
		int eve=0;
		int odd=0;
		for(int index=startValue;index<=endValu;index++){
			if(index%2==0){
				eve= eve+index;
			}else if(index%2!=0){
				odd=odd+index;
			}
		}
		sum=odd-eve;
		System.out.println("even odd sum's diffrence "+sum);
	}
	
	void reverse(int endValu,int startValue){
		System.out.println("Range -> "+startValue+" to "+endValu);
		for(int index=endValu;index>=startValue;index--){
			if(index%2==1){
				System.out.println(index);
			}
		}
	}
	
		
		
		
	public static void main(String[] arg){
		Assignment assi = new Assignment();
		assi.evenValu(5,50);
		assi.div5(10,100);
		assi.div53(5,18);
		assi.div713(1,100);
		assi.sum(1,5);
		assi.diffEvnOdd(3,9);
		assi.reverse(20,10);
	}
}
