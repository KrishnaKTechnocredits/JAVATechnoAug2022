//4) Write a method to return min number from array.
//input : {11,4,55,23,43}
//output : 4

package harshadaJagtap.Array;

public class Example4 {
	 
	int getMinNumber(int[] num) {
		int min=num[0];
		
		 for(int index=0;index<num.length;index++) {	
				if(num[index]<min) {
					min=num[index];
				}							 
		 }
		return min; 
	}
	
	public static void main(String[] args) {
		Example4 example4=new Example4();
		int[] arr= {11,4,55,23,43};
		System.out.println(example4.getMinNumber(arr));
	}
}
