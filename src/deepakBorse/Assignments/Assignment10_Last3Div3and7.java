/*
Find last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147   */
package deepakBorse.Assignments;

public class Assignment10_Last3Div3and7 {

	// Reverse order from 200 to 10 and get last 3 number divisible by 3 & 7
	void processDataR(int startR, int endR) {
		int count1 = 0, index;
		System.out.println("Number Divisible by 3 & 7 in reverse order from " + endR + " to " + startR);
		for (index = endR; index >= startR; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index);
				count1++;
			}
			if (count1 == 3)
				break;
		}

	}

	public static void main(String[] args) {
		Assignment10_Last3Div3and7 Assignment10_Last3Div3and7 = new Assignment10_Last3Div3and7();

		Assignment10_Last3Div3and7.processDataR(10, 200);
	}

}
