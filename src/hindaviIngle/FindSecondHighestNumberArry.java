package hindaviIngle;

public class FindSecondHighestNumberArry {
	int findSecondHighest(int[] arry) {
		int maxNum = arry[0];
		int secondMax=0;
		for (int index = 1; index < arry.length; index++) {
			if (arry[index]>maxNum) {
				secondMax = maxNum;
				maxNum = arry[index];
			} else if(arry[index]>secondMax) {
				secondMax = arry[index];
			}
		}
		return secondMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindSecondHighestNumberArry f1 = new FindSecondHighestNumberArry();
		int[] numbers = { 1000, 60, 200, 90, 65 };
		System.out.println("Second highest salary is  ------" + f1.findSecondHighest(numbers));
	}
}
