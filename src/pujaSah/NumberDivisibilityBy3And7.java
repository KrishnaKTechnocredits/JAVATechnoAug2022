package pujaSah;

public class NumberDivisibilityBy3And7 {
	
	void divisibleNumbersBy3And7(int range1, int range2) {
		System.out.println("The 1st 3 nos. from "+range1+" to "+range2+" that are divisible by 3 and 7 are ");
		int count=0;
		for(int index=range1;index<=range2;index++) {
			if(count==3) {
				break;
			}
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		new NumberDivisibilityBy3And7().divisibleNumbersBy3And7(20, 100);
	}
}
