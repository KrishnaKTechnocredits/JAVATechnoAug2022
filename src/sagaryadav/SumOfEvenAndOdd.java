package sagaryadav;

class SumOfEvenAndOdd{
		
	void sumOfEvenAndOdd(int startIndex, int endIndex){
		int sum1=0;
		int sum2=0;
		System.out.println("Sum of Odd and Even between ("+startIndex + " to " +endIndex+ ") are: ");
		for (int index=startIndex; index<=endIndex; index++){
			if(index%2==0){
			sum1=sum1+index;
			}
			else if(index%2==1){
			sum2=sum2+index;
			}
			}
			System.out.println(sum2-sum1);
	}
	
	public static void main(String[] args){
		SumOfEvenAndOdd forLoop = new SumOfEvenAndOdd();
		System.out.println("");
		forLoop.sumOfEvenAndOdd(3,13);
	}
}