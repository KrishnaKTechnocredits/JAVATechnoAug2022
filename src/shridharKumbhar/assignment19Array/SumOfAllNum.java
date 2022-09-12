//Sum of num given in array [10,11,15]
package shridharKumbhar.assignment19Array;

public class SumOfAllNum {
	
	int getSumOfNum(int[] array ) {
		
		int totalSum = 0;
		
		for (int index = 0; index < array.length ; index++) {
			
			totalSum = totalSum + array[index] ;	
		}
		return totalSum;
	}
		public static void main(String[] args) {
			
			int[] array = {10,11,15};
			SumOfAllNum sumOfAllNum = new SumOfAllNum();
			sumOfAllNum.getSumOfNum(array);
			System.out.println("Sum of  all num in array: " + (new SumOfAllNum().getSumOfNum(array)));
		}
}
