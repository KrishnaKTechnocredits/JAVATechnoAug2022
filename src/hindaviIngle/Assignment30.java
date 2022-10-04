/*
 * Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy (the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}
 */
package hindaviIngle;

public class Assignment30 {

	void duplicateArrya(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] == intArray[j] && i != j) {
					temp = intArray[j];
					intArray[j] = 0;
				}
			}
			if (temp > 0)
				System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment30 a1 = new Assignment30();
		int[] arry = { 10, 12, 44,12, 77,67, 12, 44 };
		System.out.println("Output");
		a1.duplicateArrya(arry);
	}

}
