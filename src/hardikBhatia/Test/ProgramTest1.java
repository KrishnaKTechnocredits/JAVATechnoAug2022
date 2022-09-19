package hardikBhatia.Test;

//On User defined range, print first 3 numbers which are divisible by 3 and 7.
public class ProgramTest1 {
	
	void findNumberDivisibleBy3and7(int startIndex, int endIndex) {
		int count = 0;
		for(int index = startIndex; index <= endIndex; index++) {
			if(index%3 == 0 && index%7 == 0) {
				System.out.println(index);
				count++;
				if(count == 3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ProgramTest1 programTest1 = new ProgramTest1();
		System.out.println("1st User defined Range is 20 to 100");
		programTest1.findNumberDivisibleBy3and7(20,100);
		System.out.println("1st User defined Range is 30 to 150");
		programTest1.findNumberDivisibleBy3and7(30,150);
	}
	
}
