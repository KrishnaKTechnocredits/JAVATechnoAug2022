package vinod.Assignment;

public class Assignment35 {	
	int returnSumOfNumbers(String input) {
		String[] inputArr = input.split(" ");
		int sum = 0;
		int num = 0;
		System.out.print("Sum of Numbers: ->  ");
		for (int index = 0; index < inputArr.length; index++) {
			try {
				num = Integer.parseInt(inputArr[index]);
				System.out.print("\"" + num + "\"" + " ");
				sum = sum + num;
			} catch (NumberFormatException ne) {
			}
		}
		System.out.print(" is -> ");
		return sum;
	}
	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "I have 15 years and 3 months of experience";
		System.out.println("Input String: -> " + input);
		System.out.println("---------------------------------------------------");
		System.out.println(assignment35.returnSumOfNumbers(input));	
	}
}



