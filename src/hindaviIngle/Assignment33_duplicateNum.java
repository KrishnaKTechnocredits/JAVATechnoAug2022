
/*
 * 
Program 1: print duplicate numbers from given array. 

input : {10,20,10,44,33,55,33};
output : 10
		 33
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment33_duplicateNum {
	void getDuplicateNum(int[] numArray) {
		for (int i = 0; i < numArray.length; i++) {
			int count = 0;
			for (int j = i + 1; j < numArray.length; j++) {
				if (numArray[i] == numArray[j] && i != j) {
					count++;
					numArray[j] = replaceNum(numArray);
				}
			}
			if (count > 0) {
				System.out.println(numArray[i]);
			}
		}
	}

	
//Alternate generic method by replacing 0 or -1(replacing no which is not present in array)
//	void getDuplicateNumWithZero(int[] numArray) {
//		for (int i = 0; i < numArray.length; i++) {
//			int count = 0;
//			for (int j = i + 1; j < numArray.length; j++) {
//				if (numArray[i] == numArray[j] && i != j) {
//					count++;
//					 numArray[j]=0;
//				}
//			}
//			if (count > 0) {
//				System.out.println(numArray[i]);
//			}
//
//		}
//
//	}
	int replaceNum(int[] numArray) {
		int replaceNum = 0;
		boolean isZeroAvailable = false;
		int minNum = numArray[0];
		for (int num : numArray) {
			if (num == 0) {
				isZeroAvailable = true;
			}
			if (num < minNum) {
				minNum = num;
			}
		}
		if (isZeroAvailable)
			replaceNum = minNum - 1;
		else
			replaceNum = 0;
		return replaceNum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_duplicateNum a33 = new Assignment33_duplicateNum();
		int[] numArry = { 10, 20, 10, 44, 33, 55, 33 };
		System.out.println("Input " + Arrays.toString(numArry));
		System.out.println("Output :");
		a33.getDuplicateNum(numArry);
	}

}
