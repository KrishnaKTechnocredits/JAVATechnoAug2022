// Find last three number divisible by 3 &7
package shridharKumbhar;

public class Assignment_10_Shridhar {

	int count = 0;

	void divisibleBy3And7(int num1, int num2) {
		if (num2 > num1) {
			for (int index = num2; num2 > num1; index--) {
				if (index % 3 == 0 && index % 7 == 0) {
					count++;
					System.out.println(
							"Last 3number divisible by 3 and 7 between " + num1 + " & " + num2 + " : " + index);
					if (count == 3)
						break;
				}
			}
		} else
			System.out.println("Invalid range");
	}

	public static void main(String[] args) {
		Assignment_10_Shridhar assignment_10_Shridhar = new Assignment_10_Shridhar();
		assignment_10_Shridhar.divisibleBy3And7(10, 200);
	}

}
