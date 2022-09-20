package amolMule.test4;

public class ArrayPillars {
	int getCountVisibleHeight(int[] arr) {
		int cnt = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				max = arr[i];
				cnt++;
			}
		}
		return cnt;
	}
	
public static void main(String[] args) {
		ArrayPillars ap = new ArrayPillars();
		int arr[] = { 3, 2, 4, 5, 2, 1 };
		int arr1[] = { 3, 7, 5 };
		int n = ap.getCountVisibleHeight(arr);
		System.out.println(n);
		int n1 = ap.getCountVisibleHeight(arr1);
		System.out.println(n1);
	}
}
