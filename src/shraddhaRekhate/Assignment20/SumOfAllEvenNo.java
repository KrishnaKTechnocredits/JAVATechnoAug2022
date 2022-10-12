package shraddhaRekhate.Assignment20;

public class SumOfAllEvenNo {
	//Time required : 6 minutes
//	Write a method to return sum of all even numbers in given array.
//			input : {10,11,15,6}
//			output : 16
  int sumOfAllEvenNoInGIvenArray(int[] arr) {
	  int sum=0;
	  for(int index=0;index<arr.length;index++) {
		  if(arr[index]%2==0) {
			  sum=sum+arr[index];
		  }
	  }
	  return sum;
  }
  public static void main(String[] args) {
	  int[] arr={10,11,15,6};
	SumOfAllEvenNo evenSUm= new SumOfAllEvenNo();
	System.out.println("Sum of all even number in given array is "+evenSUm.sumOfAllEvenNoInGIvenArray(arr));
}

}
