
/*

Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
			55
		 
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment33_uniqueNumFre1 {

	void printUniqueNumFromArry(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			boolean flag = false;
			for (int j = 0; j < numArray.length; j++) {
				if (numArray[i] == numArray[j] && i != j) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(numArray[i]);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_uniqueNumFre1 a = new Assignment33_uniqueNumFre1();
		System.out.println("Print unique numbers from given array (having freq 1)");
		int[] arry = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input: "+Arrays.toString(arry));
		a.printUniqueNumFromArry(arry);
	}

}
