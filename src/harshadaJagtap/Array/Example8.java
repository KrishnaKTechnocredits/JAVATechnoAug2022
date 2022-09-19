//sum of all even numbers from array

package harshadaJagtap.Array;

public class Example8 {
	
	
	
	int getEvenNumber(int num) {
		if(num%2==0) {
			return num;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int sum=0;
		int evenNum=0;
		Example8 example8=new Example8();
		int[] arr= {10,11,15,16};
		for(int index=0;index<arr.length;index++) {
			evenNum=example8.getEvenNumber(arr[index]);
		}
		sum=sum+ evenNum;
		System.out.println(sum);
	}

}
