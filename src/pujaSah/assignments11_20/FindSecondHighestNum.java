package pujaSah.assignments11_20;

public class FindSecondHighestNum {

	int getSeconHighestNo(int[] arr) {
		int maxNo = 0;
		int secondMaxNo = 0;
		if (arr[0] > arr[1]) {
			maxNo = arr[0];
			secondMaxNo = arr[1];
		} else {
			maxNo = arr[1];
			secondMaxNo = arr[0];
		}
		for (int i = 2; i < arr.length - 1; i++) {
			if (arr[i] > maxNo) {
				secondMaxNo = maxNo;
				maxNo = arr[i];
			} else if (arr[i] < maxNo && arr[i] > secondMaxNo) {
				secondMaxNo = arr[i];
			}
		}
		return secondMaxNo;
	}

	public static void main(String[] args) {
		FindSecondHighestNum obj = new FindSecondHighestNum();

		int[] array = {10, 99, 33, 44, 89, 76};
		System.out.println("Second highest no is " + obj.getSeconHighestNo(array));
	}
}
