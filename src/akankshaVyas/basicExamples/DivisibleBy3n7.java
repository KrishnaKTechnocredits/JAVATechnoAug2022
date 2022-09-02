package akankshaVyas.basicExamples;

public class DivisibleBy3n7 {
	
	void divisibleBy3n7(int startIndex, int endIndex) {
		int count=0;
		for(int index=startIndex; index <= endIndex; index++) {
			if(index %3 ==0 && index%7 ==0) {
				count++;
				System.out.println("The divisible num are " + index);
				if(count==3)
					break;
			}
		}
	}
		
	public static void main(String[] args) {
	new DivisibleBy3n7().divisibleBy3n7(20,70);
	}
}


