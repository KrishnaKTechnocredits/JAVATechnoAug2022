package harshalRane;

class LoopAssignment6{
	
	void sumDisplay(int startNum, int endNum){ 
		int sum = 0;
		for(int num=startNum;num<=endNum;num++){
			sum = sum + num;
		}
		System.out.println("1. Sum of Numbers between "+startNum+" to "+endNum+" is: " +sum); //Sum of Numbers between startNum and endNum
	}
	
	void evenNumbers(int i){
		System.out.println("2. Even Numbers are:");
		for(int j=0;j<=i;j++){
			if(j%2==0){
				System.out.println(j);
			}
		}
		
	}
	
	void oddNumbers(int i){
		System.out.println("3. Odd Numbers are:");
		for(int j=0;j<=i;j++){
			if(j%2==1){
				System.out.println(j);
			}
		}
		
	}
	
	public static void main(String[] args){
		LoopAssignment6 loopAssignment6 = new LoopAssignment6();
		loopAssignment6.sumDisplay(1,10);
		loopAssignment6.evenNumbers(10);
		loopAssignment6.oddNumbers(10);
	}
}
