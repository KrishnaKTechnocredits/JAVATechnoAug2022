package shraddhaRekhate;
class LoopEx4{
	void m1(int startIndex,int endIndex){
		System.out.println("Even numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0 ){
				System.out.println(index);
			}
		}
	}
	
	void m2(int startIndex,int endIndex){
		System.out.println("Divisible by 5 numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0 ){
				System.out.println(index);
			}
		}
	}
	
	void m3(int startIndex,int endIndex){
		System.out.println("Divisible by 5 and 3, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%5==0 && index%3==0 ){
				System.out.println(index);
			}
		}
	}
	
	void m4(int startIndex,int endIndex){
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%7==0 || index%13==0){
				if(index%7==0){
				System.out.println(index + "is divisible by 7");
				}else{
					System.out.println(index + "is divisible by 13");
				}
		    }
		}
		
	 }
	
	void m5(int startIndex,int endIndex){
		int sum=0;
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index=startIndex;index<=endIndex;index++){
				sum=sum+index;
		}
		System.out.println("sum is"+ sum);
	}
	
	void m6(int startIndex,int endIndex){
		int sumOdd=0;
		int sumEven=0;
		for(int index=startIndex;index<=endIndex;index++){
			if(index%2==0){
				sumEven=sumEven+index;
			}else{
					sumOdd=sumOdd+index;
			        }
		}
		System.out.println(sumOdd-sumEven);
	 }
	
	void m7(int startIndex,int endIndex){
		int sum=0;
		for(int index=endIndex;index>=startIndex;index--){
			if(index%2!=0 ){
				sum=sum+index;
			}
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		LoopEx4 loopEx4=new LoopEx4();
		loopEx4.m1(10,15);
		loopEx4.m2(10,30);
		loopEx4.m3(5,18);
		loopEx4.m4(5,40);
		loopEx4.m5(1,5);
		loopEx4.m6(3,9);
		loopEx4.m7(10,20);
	}
}	