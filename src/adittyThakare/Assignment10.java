package adittyThakare;

public class Assignment10 {
	
	void processNumberDivisibleBy3And7(int startIndex, int endIndex) {
		int result = 0;
		
		System.out.println("Numbers divisible by 3 and 7 are: ");
		for(int index=startIndex;index<=endIndex;index++){
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				result++;
			}
			if(result==3)
				break;
		}		
	}
	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.processNumberDivisibleBy3And7(20,100);
	}
}
