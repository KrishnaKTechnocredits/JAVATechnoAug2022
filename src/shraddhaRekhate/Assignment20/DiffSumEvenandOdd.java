package shraddhaRekhate.Assignment20;
//Timer required 8 minutes
//4. Write a method to return difference of sum of all even numbers and odd numbers in given array.
//input : {10,11,15,6}
//output : 10
//Hint : 16 - 26 = 10


public class DiffSumEvenandOdd extends SumOfAllEvenNo{
	int sumOfAllOddNumberInGivenArray(int[] arr) {
		int oddSum=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2!=0) {
				oddSum=oddSum+arr[index];
			}
		}
		return oddSum;
	}
   public static void main(String[] args) {
	   int[] arr= {10,11,15,6};
	   DiffSumEvenandOdd obj2= new DiffSumEvenandOdd();
	   System.out.println("Diffetrence of sum of all even and odd number in given array is "
	   		+ (obj2.sumOfAllOddNumberInGivenArray(arr)-obj2.sumOfAllEvenNoInGIvenArray(arr)));
}
}
