package rahulSaswadkar;

public class DivisibleBy3And7 {
	
	public static void main(String[] args) {
		DivisibleBy3And7 divisibleBy3And7 = new DivisibleBy3And7();
		divisibleBy3And7.findDivisibleNumbers(20,100,3,7);
	}
	
	void findDivisibleNumbers(int startIndex, int endIndex, int divisor1, int divisor2) {
		int count = 0;
		for(int index = startIndex; index<=endIndex;index++) {
			if(index % divisor1 ==0 && index % divisor2 == 0) {
				System.out.println(index);
				count += 1;
				if(count == 3) {
					break;
				}
			}
		}
	}
}
