package hardikBhatia.Assignments;
import java.util.Arrays;  
public class Assignment24 {

	int sumOfNumberInarray(int[] numbers, int currentIndexNumber) {
		int sum = 0;
		for(int index = 0 ; index < numbers.length; index++) {
			sum += numbers[index];
		}
		
		return sum - currentIndexNumber;
	}
	
	String readNumberList(int[] numbers) {
		int[] newNumbers = new int[numbers.length];
		for(int index = 0; index < numbers.length; index++) {
			newNumbers[index] = this.sumOfNumberInarray(numbers, numbers[index]);
		}
		return Arrays.toString(newNumbers);
	}
	public static void main(String[] args) {
		Assignment24 assignment24 = new Assignment24();
		int[] numbers = {12,2,11,17};
		System.out.println("Input : {12,2,11,17}");
		System.out.println("Output : " + assignment24.readNumberList(numbers));
		

	}

}
