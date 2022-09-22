/*Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/
package ankitaBarwad;

import java.util.Arrays;

public class ReplaceNextIndexArraysExample {

	int[] getReplacedArray(int[] inputArray){
		
		for(int index = 0; index < inputArray.length-1; index++) {
			if(inputArray[index+1] < inputArray[index]) {
				inputArray[index] = 0;
			}
		}
		return inputArray;
	}
	
	public static void main(String[] args) {
		ReplaceNextIndexArraysExample arrayExample1 = new ReplaceNextIndexArraysExample();
		int[] inputArray = {10,20,30,22,44,21,92,89};
		System.out.println(Arrays.toString(inputArray));
		int[] outputArray = arrayExample1.getReplacedArray(inputArray);
		System.out.println(Arrays.toString(outputArray));
	}

}
