/*Assignment - 20 : 10th Sep'2022
4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10*/

package rashmiG.assignment20ArrayAndStringPrograms;

class DifferenceOfEvenOddSum{
	int evenSum=0;
	int oddSum=0;

	boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
	
	boolean isOdd(int num){
		if(num%2!=0){
			return true;
		}
		return false;
	}
	
	int getDiffOfEvenOddSum(int[] input){	
		int evenSum=0,oddSum=0;
		for(int index=0;index<input.length;index++){
			if(isEven(input[index])){
				evenSum=evenSum+input[index];
			}
			else{
				oddSum=oddSum+input[index];
			}
		}
		
		if(evenSum>=oddSum)
			return evenSum-oddSum;
		return oddSum=oddSum-evenSum;
	}
	
	void display(int[] input){
		
			System.out.println("Difference of sum of all even numbers and odd numbers in given array : "+getDiffOfEvenOddSum(input));
	}
	
	public static void main(String[] args){
		int[] input= {10,11,15,6};
		int[] input1={0,6,8,1};
		DifferenceOfEvenOddSum diffOfEvenOddSum= new DifferenceOfEvenOddSum();
		diffOfEvenOddSum.display(input);
		diffOfEvenOddSum.display(input1);
		
		
	}
}
	