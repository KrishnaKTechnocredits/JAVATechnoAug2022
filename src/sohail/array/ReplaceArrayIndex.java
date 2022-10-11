//Assignment - 22 : 15th Sep'2022
//Replace current index number with 0, if index+1 number is smaller then index number.
//int[] arr = {10,20,30,22,44,21,92,89};
//output : {10,20,0,22,0,21,0,89}
package sohail.array;

public class ReplaceArrayIndex {
	int[] getreplcedArrayIndex(int[] inputArray) {
		for (int index = 0; index < inputArray.length - 1; index++) {
			if (inputArray[index] > inputArray[index + 1]) {
				inputArray[index] = 0;
			}
		}
		return inputArray;
	}

	void printArray(int[] prntArr) {
		for (int index = 0; index < prntArr.length; index++) {
			System.out.print(prntArr[index] + ", ");
		}
	}

	public static void main(String[] args) {
		ReplaceArrayIndex replacearrayindex = new ReplaceArrayIndex();
		int[] inputArray = { 10, 20, 30, 22, 44, 21, 92, 89 };
		replacearrayindex.printArray(inputArray);
		System.out.println("\n");
		int[] output = replacearrayindex.getreplcedArrayIndex(inputArray);
		replacearrayindex.printArray(output);
	}
}
