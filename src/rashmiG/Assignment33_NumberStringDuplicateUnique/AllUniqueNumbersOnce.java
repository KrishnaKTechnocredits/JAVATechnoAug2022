/*Assignment - 33 : 1st Oct'2022
Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55*/

package rashmiG.Assignment33_NumberStringDuplicateUnique;

//import java.util.Arrays;
import java.util.Scanner;

public class AllUniqueNumbersOnce {

	static void printAllUniqueNumbersOnce(int[] input) {
		System.out.println("\nOutput");
		System.out.println(input[0]);
		for (int index = 1; index < input.length; index++) {
			boolean flag = true;
			for (int innerIndex = index - 1; innerIndex >= 0; innerIndex--) {
				if (input[index] == input[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("how many numbers you want to have in array");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the " + (index + 1) + " number");
			input[index] = sc.nextInt();
		}
		printAllUniqueNumbersOnce(input);
		sc.close();
	}
}
