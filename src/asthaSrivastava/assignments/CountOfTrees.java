/*Program 2 : Return count of visible trees. [15 - 20 mins, max - 30 mins]

input : {3,7,5}
output : 2

input : {3,5,11,9,10,13}
output : 4*/
package asthaSrivastava.assignments;

public class CountOfTrees {

	int getCountOfTrees(int[] arry) {
		int count= 0;
		int maxT = 0;
		for (int index = 0; index < arry.length; index++) {
			if (maxT < (arry[index])) {
				maxT = (arry[index]);
				count++;
			}
		}
		
		return count;
	}


	public static void main(String[] args) {
		CountOfTrees array = new CountOfTrees();
		int[] num1 = { 3, 7, 5 };
		int count1 = array.getCountOfTrees(num1);
		System.out.println("Return count of given array is :" + count1 + "\n");
		
		int[] num2 = {3,5,11,9,10,13};
		int count2 = array.getCountOfTrees(num2);
		System.out.println("Return count of  given array as :" + count2 + "\n");
	}
}
