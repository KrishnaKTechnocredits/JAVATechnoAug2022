/*Test 4 - 11th Sep'2022
Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]
input : {3,7,5}
output : 2
input : {3,5,11,9,10,13}
output : 4
*/
package pankajBhatt;

public class Test_4_Prog_1_11_Sep2022_TreeVisibleOrNot {
	
	int isVisible(int[] arr) {
		int flag = 0, count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > flag ) {
				count++;
				flag = arr[i];
			}
		} 
		return count;		
	}

	public static void main(String[] args) {
		Test_4_Prog_1_11_Sep2022_TreeVisibleOrNot treeVisibleOrNot = new Test_4_Prog_1_11_Sep2022_TreeVisibleOrNot();
		int[] input = { 3, 5, 11, 7, 10, 13, 14 };
		System.out.println("Count of visible trees is: " + treeVisibleOrNot.isVisible(input));
	}
}