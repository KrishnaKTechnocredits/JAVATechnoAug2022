/*Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/


package manjiri.arrayEx.assignment33;

public class UniqueNumbers {
	
	void printUniqueNumbers(int[] numArr){
		for (int index = 0; index < numArr.length; index++) {
			boolean flag = true;
			//compare outer index with each inner index and check if match found
			for (int innerIndex = 0; innerIndex < numArr.length; innerIndex++) {
				if(numArr[index] == numArr[innerIndex] & index != innerIndex) {
					flag = false;
				}
			}
			if(flag) {
				System.out.println(numArr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] inputArr = {10,20,10,44,33,55,33};
		new UniqueNumbers().printUniqueNumbers(inputArr);
	}
}
