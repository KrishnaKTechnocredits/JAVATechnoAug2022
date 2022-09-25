package shraddhaRekhate.Assignment19;

public class MaxNum {
	//Write a method to return max number from array.
   //input : {11,4,55,23,43}
  //output : 55
   int maxNoFromArr(int[] arr) {
	   int max=0;
	   for(int index=0;index<arr.length;index++) {
		   if(max<arr[index]) {
			   max=arr[index];
		   }
	   }
	   return max;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MaxNum obj= new MaxNum();
     int[] arr= {11,2,55,23,43};
     System.out.println("Max number in given array is "+obj.maxNoFromArr(arr));
	}

}
