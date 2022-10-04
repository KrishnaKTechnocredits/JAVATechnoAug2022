//3) Write a method to return max number from array.
//input : {11,4,55,23,43}
//output : 55

package harshadaJagtap.Array;

public class Example3 {
	
	int getMaxNum(int[] a) {
		int max=0;
		for(int index=0;index<a.length;index++) {
			if(max<a[index])
				max=a[index];
		}
		return max;
	}
	
	public static void main(String[] args) {
		Example3 example3=new Example3();
		int[] arr= {11,4,55,23,43};
		System.out.println(example3.getMaxNum(arr));
	}

}
