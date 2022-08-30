package adittyThakare;

public class Assignment10_Last3Numbers {
	
	void processNumberDivisibleBy3And7(int startIndex, int endIndex) {
		int result = 0;
		
		System.out.println("Last 3 numbers divisible by 3 and 7 from "+startIndex+" and "+endIndex+" are: ");
		for(int index=endIndex;index>=startIndex;index--){
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				result++;
			}
			if(result==3)
				break;
		}		
	}
	public static void main(String[] args) {
		Assignment10_Last3Numbers assignment10 = new Assignment10_Last3Numbers();
		assignment10.processNumberDivisibleBy3And7(10,200);
	}
}
