/*program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8*/


package manjiri.arrayEx.assignment33;

public class missingNumbers {
	
	void printMissingNumbers(int[] numArr, int startRange, int endRange){
		//iterate the range of numbers
		System.out.println("Missing Numbers are: ");
		
		System.out.println("---------------------");
		
		for(int index = startRange; index <= endRange; index++) {
			boolean flag = true;
			//iterate the input array
			for(int innerIndex = 0; innerIndex < numArr.length; innerIndex++) {
				if(index ==  numArr[innerIndex]) {
					flag = false;
					break;
				}
			}
			if(flag)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		int[] inputArr = {1,3,9,5,6,10};
		new missingNumbers().printMissingNumbers(inputArr, 1, 10);
	}

}
