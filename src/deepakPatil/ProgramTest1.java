package deepakPatil;

/*Programming Test - 1 : 28th Aug'2022

On User defined range, print first 3 numbers which are divisible by 3 and 7.
input : 20 to 100
output : 21
             42
              63
Note : Use for loop
*/

public class ProgramTest1 {

	void print3NumbersDivisibleBy3and7(int startIndex, int endIndex) {
		int count = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		new ProgramTest1().print3NumbersDivisibleBy3and7(20, 100);
	}
}
