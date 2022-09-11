/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]
input : {3,7,5}
output : 2
input : {3,5,11,9,10,13}
output : 4*/

package manjiri.Test;

public class Test4_2 {
	int getCountOfVisibleTrees(int[] input) {
		int count = 0;
		int maxHeight = 0;
		
		for (int index = 0; index < input.length; index++) {
			if (maxHeight < input[index]) {
				maxHeight = input[index];
				count++;
			}			
		}
		return count;
	}
	
	public static void main(String[] args) {
		Test4_2 test42 = new Test4_2();
		int[] input1 = {3,7,5};
		System.out.println("Count of visible trees "+"input1"+" "+"is: "+ test42.getCountOfVisibleTrees(input1));
		
		int[] input2 = {3,5,11,9,10,13};
		System.out.println("Count of visible trees "+"input2"+" "+"is: "+ test42.getCountOfVisibleTrees(input2));
	}
}
