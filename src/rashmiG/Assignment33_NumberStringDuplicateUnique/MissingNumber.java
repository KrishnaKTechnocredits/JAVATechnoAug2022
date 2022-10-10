/*Assignment - 33 : 1st Oct'2022
 program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

import java.util.Scanner;

public class MissingNumber {

	static void printMissingNumbers(int[] input) {
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNumbFlag = true;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) {
					isMissingNumbFlag = false;
					break;
				}
			}
			if (isMissingNumbFlag) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("how many naumbers you want to enter");
		int length = sc.nextInt();
		int[] input = new int[length];
		for (int index = 0; index < length; index++) {
			System.out.println("Enter the " + (index + 1) + " number");
			input[index] = sc.nextInt();
		}
		System.out.println("====Output======");
		MissingNumber.printMissingNumbers(input);

		sc.close();
//		int[] input =  {1,3,9,5,6,10};
//		MissingNumber.printMissingNumbers(input);
	}

}
