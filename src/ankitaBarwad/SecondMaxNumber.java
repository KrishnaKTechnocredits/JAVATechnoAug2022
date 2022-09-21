/*Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/
package ankitaBarwad;

public class SecondMaxNumber {

	int getSecondMaxNumber(int[] numbersArray) {
		int maxNumber = 0;
		int secondMaxNumber = 0;
		for (int index = 0; index < numbersArray.length; index++) {
			if (maxNumber < numbersArray[index]) {
				secondMaxNumber = maxNumber;
				maxNumber = numbersArray[index];
			} else if (secondMaxNumber < numbersArray[index]) {
				secondMaxNumber = numbersArray[index];
			}
		}
		return secondMaxNumber;
	}

	public static void main(String[] args) {
		SecondMaxNumber secondMaxNumber = new SecondMaxNumber();
		int[] numbersArray = { 10, 99, 33, 44, 89, 76 };
		System.out.println(secondMaxNumber.getSecondMaxNumber(numbersArray));
	}
}
