package nikitaPhase;
import java.util.Arrays;

public class Assignment_29_2 {
	
	void shiftZeroAtEnd(int[] num) {
		
		int[] output = new int[num.length];
		int count = 3;

		for (int index = 0; index < num.length; index++) {
			if (num[index] != 0) {
				output[count] = num[index];
				count++;
			}
		}
		System.out.println("Output:Shifting all zero's at "
				+ "the beginning of the an array:\n"+Arrays.toString(output));
	}

	public static void main(String[] args) {
		
		System.out.println("Program 2 : Shift all zero's at the beginning of the an array.");
		
		int[] num = { 10, 0, 0, 3, 4, 5, 0, 9 };
		
		System.out.println("Given Array is: " + Arrays.toString(num));
		
		Assignment_29_2 shift_at_begining = new Assignment_29_2();
		
		shift_at_begining.shiftZeroAtEnd(num);
	}
}
