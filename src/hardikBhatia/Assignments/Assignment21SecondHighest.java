package hardikBhatia.Assignments;

public class Assignment21SecondHighest {

	int findSecondHighestNumber(int[] numbers) {
		int max = numbers[0];
		int secondMax = 0;
		for(int index = 0; index < numbers.length;index++) {	
			if(max < numbers[index]) {
				secondMax = max;
				max = numbers[index];
			}else if(secondMax < numbers[index]) {
				secondMax = numbers[index];
			}
		}
		return secondMax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment21SecondHighest assignment21SecondHighest = new Assignment21SecondHighest();
		int[] numbers = {10,99,33,44,89,76};
		System.out.println("{10,99,33,44,89,76}");
		System.out.println(assignment21SecondHighest.findSecondHighestNumber(numbers));
		int[] numbers2 = {10,99,33,44,89,76,100,150};
		System.out.println("{10,99,33,44,89,76,100,150}");
		System.out.println(assignment21SecondHighest.findSecondHighestNumber(numbers2));
	}

}
