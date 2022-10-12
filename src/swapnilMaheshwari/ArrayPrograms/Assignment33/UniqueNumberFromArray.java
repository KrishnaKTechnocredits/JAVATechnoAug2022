/*
 Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55
 */
package swapnilMaheshwari.ArrayPrograms.Assignment33;

public class UniqueNumberFromArray {

	void printUniqueNumber(int[] arr) {
		// int[] output=new int [arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && i != j) {
					// output[i]=arr[i];
					arr[i] = 0;
					arr[j] = 0;
				}

			}
			if (arr[i] != 0)
				System.out.println(+arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		new UniqueNumberFromArray().printUniqueNumber(input);
	}
}
