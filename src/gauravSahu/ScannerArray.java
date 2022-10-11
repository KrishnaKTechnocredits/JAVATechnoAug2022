package gauravSahu;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to print : ");
		int length = sc.nextInt();

		int[] num = new int[length];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Please " + (i+1) + " enter number : ");
			num[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
	}

}
