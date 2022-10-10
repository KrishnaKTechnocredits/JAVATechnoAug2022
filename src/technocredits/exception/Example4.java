package technocredits.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[3];
		
		while(count<3) {
			try {
				System.out.println("Enter number : ");
				int num = sc.nextInt();
				arr[count] = num;
				System.out.println("Yupii, you got it..." + num);
				count++;
			}catch(InputMismatchException ie) {
				System.out.println("Not a valid number, please try again");
				sc.nextLine();
				//System.out.println(str);
			}
		}
	}
}
