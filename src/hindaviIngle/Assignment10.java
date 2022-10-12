
/*
 * Assignment - 10 : 30th Aug'2022
Find the last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147   

 */
package hindaviIngle;

public class Assignment10 {

	int count;

	void noDivisibility(int startindex, int endindex) {
		for (int index = startindex; index <= endindex; index++) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index + " is divisible by 3 & 7");
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment10 noisDivisible3and7 = new Assignment10();
		noisDivisible3and7.noDivisibility(20, 100);
	}
}
