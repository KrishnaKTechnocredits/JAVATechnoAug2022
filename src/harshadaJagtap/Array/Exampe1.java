//sum of array elements

package harshadaJagtap.Array;

public class Exampe1 {
	int sum=0;
	
	int getArraySum(int[] a) {
		for(int index=0; index<a.length;index++) {
			sum=sum+a[index];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		Exampe1 exampe1=new Exampe1();
		int[] arr= {10,11,13};
		System.out.println(exampe1.getArraySum(arr));
	}
}
