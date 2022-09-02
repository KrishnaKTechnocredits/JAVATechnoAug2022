package technocredits.loopexamples;

class LoopEx2{
	
	void processData(int num){
		int sum = 0;
		for(int index=1;index<=num;index++){
			sum = sum + index;
		}
		System.out.println( + sum); // Sum of 10 to 20 is : ans
	}
	
	void printDivisibility(int num){ // 1 to 20 : num %3 == 0
		if(num%3==0){
			System.out.println(num);
		}
	}
	
	// div by 3 and 7, between 1 to 100
	void m1(int startIndex, int endIndex){
		for(int index=startIndex;index<=endIndex;index++){
			
		}
	}
	
	
	public static void main(String args[]){
		LoopEx2 loopEx2 = new LoopEx2();
		loopEx2.processData(5);
	}
}

