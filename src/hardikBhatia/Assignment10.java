//Assignment - 10 : 30th Aug'2022
//Find the last 3 numbers divisible by 3 and 7.

package hardikBhatia;

public class Assignment10 {
	void findNumberDivisibleBy3and7(int startIndex, int endIndex) {
		int count = 0;
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index);
				count++;
				if (count == 3) {
					break;
				}
			}
		}
	}
	
	void findSecondLastNumberDivisibleBy3and7(int startIndex, int endIndex) {
		int count = 0;
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				count++;
				if (count == 2) {
					System.out.println(index);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		System.out.println("1st User defined Range is 10 to 200");
		assignment10.findNumberDivisibleBy3and7(10, 200);
		System.out.println("2nd last number User defined Range is 10 to 200");
		assignment10.findSecondLastNumberDivisibleBy3and7(10, 200);
	}
}
