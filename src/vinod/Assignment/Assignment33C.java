/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2, 4, 7, 8*/
package vinod.Assignment;

public class Assignment33C {
	
	void getMissingNum(int[] input) {
		for (int index = 1; index <= 10; index++) {
			boolean isMissing = true;
			for (int index2 = 0; index2 < input.length; index2++) {
				if (index == input[index2]) {
					isMissing = false;
					break;
				}
			}
			if (isMissing) {
				System.out.println(index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33C assign= new Assignment33C();
		int[] input = { 1, 3, 9, 5, 6, 10 };
		assign.getMissingNum(input);
	}

}
