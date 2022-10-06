/*Assignment - 21 : 14th Sep'2022

Return second highest from given array.
input : {10,99,33,44,89,76}
output : 89*/

package hindaviIngle;

public class Assignment21 {
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
		Assignment21 f1 = new Assignment21();
		int[] numbers = { 1000, 60, 200, 90, 65 };
		System.out.println("Second highest salary is  ------" + f1.findSecondHighest(numbers));
	}
}
