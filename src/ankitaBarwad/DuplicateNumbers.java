/*Assignment - 30 : 28th Sep'2022

Find duplicate numbers from given array.
input : {10,12,44,12,77,67,12,44};
output : 12
         44 

Hint : 2 for loop, think about replacement stretagy 
(the number you compare, replace that number with other number)


if(arr[i] == arr[j] && i!=j){
	arr[j] = 0;
}*/
package ankitaBarwad;

public class DuplicateNumbers {

void printDuplicateNumbers(int[] inputArray){
		
		int replaceNum;
		boolean isZeroAvailable = false;
		int minNum=inputArray[0];
		
		for(int i = 0; i < inputArray.length; i++){
			if(inputArray[i] == 0){
				isZeroAvailable = true;
			}
			
			if(minNum > inputArray[i]){
				minNum = inputArray[i];
			}
		}
		
		if(isZeroAvailable){
			replaceNum = minNum-1;
		}else{
			replaceNum = 0;
		}
		
		for(int index = 0; index < inputArray.length; index++){
			boolean isDuplicate = false;
			for(int innerIndex = index+1; innerIndex < inputArray.length; innerIndex++){
				if(inputArray[index] == inputArray[innerIndex] && inputArray[innerIndex]!= replaceNum){
					inputArray[innerIndex] = replaceNum;
					isDuplicate = true;
				}
			}
			if(isDuplicate){
				System.out.println(inputArray[index]);
			}
		}
	}
	
	public static void main(String[] args){
		int[] duplicateNumArr = {10,12,44,12,77,67,12,44};
		DuplicateNumbers duplicateNumbers = new DuplicateNumbers();
		duplicateNumbers.printDuplicateNumbers(duplicateNumArr);
	}
}
