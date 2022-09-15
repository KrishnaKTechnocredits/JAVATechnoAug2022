/*3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16
*/
package maheshSantoki.arrayExamples;
import java.util.Arrays;
public class SumEvenNumber {
	
	boolean checkEven(int num) {
		boolean flag=true;
		if(num%2==0)
			flag=false;
		else
			flag=true;
		return flag;
	}
	int getSumEven(int[] input) {
		int sum=0;
		for(int i=0;i<input.length;i++) {
			boolean flag=checkEven(input[i]);
			if(flag==false)
				sum=sum+input[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		SumEvenNumber evensum=new SumEvenNumber();
		
		int[] input = {10,11,15,6};
		System.out.println("Sum of all even numbers in given array : "+ Arrays.toString(input)+" --> "+evensum.getSumEven(input));
	}
}
