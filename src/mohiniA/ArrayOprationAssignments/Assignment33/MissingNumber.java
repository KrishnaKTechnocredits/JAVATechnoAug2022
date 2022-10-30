/*Program 3(A/B) : Print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
*/


package mohiniA.ArrayOprationAssignments.Assignment33;

import java.util.Arrays;

public class MissingNumber {
	
void getMissingNumber(int[] input,int n){
		
		int originalSum = n*(n+1)/2;
		int newSum = 0;
		
		for(int i=0; i<input.length;i++){			
			newSum=newSum+input[i];
		}
		System.out.println("Missing Number in array is: " +(originalSum-newSum));
	}

/***Another logic****/

void printMissingNumbers(int[] input){
	int Srange=01;
	int Erange = 10;
for(int i=Srange;i<=Erange;i++){
	boolean flag=true;
	for(int j=0;j<input.length;j++){
		if(i==input[j]){
			flag=false;
			break;
		}
	}
if(flag)
	System.out.println(i);
}
}
	
	public static void main(String[] args){
		System.out.println("Print missing numbers from given array from range 1 to 10");
		System.out.println("---------------------------------------");
		int[] input = {1,3,9,5,6,7,2,4,10};
		System.out.println("Input Array: \n" + Arrays.toString(input));
		System.out.println("---------------------------------------");

		new MissingNumber().getMissingNumber(input,10);
		
		System.out.println("\n\n Print missing numbers from given array from range 1 to 10 (Another logic)\n");
		System.out.println("---------------------------------------");
		System.out.println("Missing Number in array is: ");
		new MissingNumber().printMissingNumbers(input);
	}

}
