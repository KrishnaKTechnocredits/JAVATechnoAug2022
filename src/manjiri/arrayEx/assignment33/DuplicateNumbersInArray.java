/*Program 1: print duplicate numbers from given array. 
input : {10,20,10,44,33,55,33};
output : 10
		 33*/

package manjiri.arrayEx.assignment33;

public class DuplicateNumbersInArray {
	
	//Check if input array contains zero
	int getCountOfZeros(int[] inputArr){
		int count = 0;
		
		for(int index = 0; index < inputArr.length; index++) {
			if(inputArr[index] == 0) {
				count++;
			}
		}
		return count;
	}
	
	void printDuplicateNumbers(int[] numArr){
		
		int countZeros = getCountOfZeros(numArr);
		//if count of zeros is equal to 0, then we can replace duplicate element with zero
		if(countZeros == 0) {
			for(int index = 0; index < numArr.length; index++) {
				boolean flag = false;
				for(int innerIndex = index+1; innerIndex < numArr.length; innerIndex++) {
					if(numArr[index] == numArr[innerIndex]) {
						numArr[innerIndex] = 0;
						flag = true;
					}
				}
				if (flag) {
					System.out.println(numArr[index]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] inputArr = {10,20,10,44,33,55,33};
		new DuplicateNumbersInArray().printDuplicateNumbers(inputArr);
	}
}
