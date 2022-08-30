package deepakPatil;

/*Assignment - 10 : 30th Aug'2022
Find last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147   
*/

public class LoopBreakAssignment {

	void findNumberDivisibleby3and7(int startIndex, int endIndex) {
		int count = 0;
		for (int i = endIndex; i > startIndex; i--) {
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
		new LoopBreakAssignment().findNumberDivisibleby3and7(10, 200);
	}
}
