package technocredits.inteview;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter :");
		int length = sc.nextInt();
		
		int[] num = new int[length];
		for(int index=0;index<num.length;index++) {
			System.out.println("Please "+ (index+1) +" enter number : ");
			num[index] = sc.nextInt();
		}
		
		System.out.println("=====================");
		System.out.println(Arrays.toString(num));
	}
}
