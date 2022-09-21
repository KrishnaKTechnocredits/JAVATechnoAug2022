//difference between sum of even and odd numbers

package harshadaJagtap.Array;

public class Example9new {
	int diff=0;
	int evenSum=0;
	int oddSum=0;
	int getEvenSum(int[] num) {
		for(int index=0;index<num.length;index++)
		if(num[index]%2==0) {
			evenSum=evenSum+num[index];			
		}
		return evenSum;
	}
	
	int getOddSum(int[] num) {
		for(int index=0;index<num.length;index++)
		if(num[index]%2!=0) {
			oddSum=oddSum+num[index];			
		}
		return oddSum;
	}
	
	public static void main(String[] args) {
		Example9new example9=new Example9new();
		int[] arr= {10,11,15,6};
		int eSUM=example9.getEvenSum(arr);
		int oSUM=example9.getOddSum(arr);
		if(eSUM>oSUM)
			example9.diff=eSUM-oSUM;
		else
			example9.diff=oSUM-eSUM;
		System.out.println(example9.diff);
	}

}
