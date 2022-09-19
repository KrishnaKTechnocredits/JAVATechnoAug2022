/*Assignment - 20 : 10th Sep'2022
3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16*/

package rashmiG.assignment20ArrayAndStringPrograms;

class SumOfAllEvenNumbersInArray{
	
	boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		return false;
	}
	
	int getSumOfAllEvenNumbers(int[] input){
		int sum=0;
		boolean isEvenFlag=false;
		for(int index=0; index<input.length;index++){
			isEvenFlag=isEven(input[index]);
			if(isEvenFlag){
				sum=sum+input[index];
			}
		}
		return sum;
	}
	
	public static void main(String[] args){
		int[] input={10,11,15,6};
		SumOfAllEvenNumbersInArray sumOfEvenNos=new SumOfAllEvenNumbersInArray();
		int sum=sumOfEvenNos.getSumOfAllEvenNumbers(input);
		System.out.println("Sum of even Numbers in given array : "+sum);
	}
}
			
			