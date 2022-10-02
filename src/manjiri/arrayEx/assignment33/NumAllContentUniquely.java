/*Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/

package manjiri.arrayEx.assignment33;

public class NumAllContentUniquely {
	void printAllUniqueNumbers(int[] input) {
		DuplicateNumbersInArray duplicateNum = new DuplicateNumbersInArray();
		int countZeros = duplicateNum.getCountOfZeros(input);
		// if count of zeros is equal to 0, then we can replace duplicate element with
		// zero
		if (countZeros == 0) {
			for (int index = 0; index < input.length; index++) {
				// compare outer index with each inner index and check if match found
				for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
					if (input[index] == input[innerIndex] & index != innerIndex) {
						input[innerIndex] = 0;
					}
				}
				if (input[index] != 0)
					System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		int[] inputArr = { 10, 20, 10, 44, 33, 55, 33 };
		new NumAllContentUniquely().printAllUniqueNumbers(inputArr);
	}
}
