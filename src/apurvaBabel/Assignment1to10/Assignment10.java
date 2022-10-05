/*Assignment - 10 : 
Find the last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
         168
         147 
*/

package apurvaBabel.Assignment1to10;

public class Assignment10 {
	int count = 0;
     
	void divisibleBy3And7(int startIndex, int endIndex) {
		System.out.println("Last 3 numbers divisible by 3 and 7 are : ");
		for (int index = endIndex; index >= startIndex; index--) {
			if (index % 3 == 0 && index % 7 == 0) {
				System.out.println(index);
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.divisibleBy3And7(10,200);
	}
}
