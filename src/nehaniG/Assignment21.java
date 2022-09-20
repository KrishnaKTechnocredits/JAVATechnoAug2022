package nehaniG;

public class Assignment21 {
	int getMaxNum(int[] num) {
		int maxNum = 0;
		int secondMaxNum = 0;

		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNum) {
				maxNum = num[index];
			}
			else if(secondMaxNum < num[index] && num[index] < maxNum){
				secondMaxNum = num[index];
			}
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		int[] input = { 10, 99, 33, 44, 89, 76 };
		System.out.println("Second max number : " +  assignment21.getMaxNum(input));

	}

}
