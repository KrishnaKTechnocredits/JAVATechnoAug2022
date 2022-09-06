//Test01: User defined range , print first 3 numbers wg=hich are divisible by 3 and 7.
package shridharKumbhar;

public class Test1Shridhar {

	void divisionBy3and7(int num1, int num2) {

		int count = 0;

		if (num1 < num2) {
			for (int index = num1; index <= num2; index++)
				if (index % 3 == 0 && index % 7 == 0) {
					count = count + 1;
					System.out.println("Number divisible by 3 & 7 between " +num1+ " & "+ num2 + count + " : " + index);
					if (count == 3)
						break;
				}
		} else
			System.out.println("No result fount : Change range");
	}

	public static void main(String[] args) {
		Test1Shridhar test1Shridhar = new Test1Shridhar();
		test1Shridhar.divisionBy3and7(150, 32);
		test1Shridhar.divisionBy3and7(-40, 32);
		test1Shridhar.divisionBy3and7(22, 22);
		test1Shridhar.divisionBy3and7(22, 23);
	}

}
