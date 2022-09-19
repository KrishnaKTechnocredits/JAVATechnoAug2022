/*4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10*/
package maheshSantoki.arrayExamples;
import java.util.Arrays;
public class Differnceoddeven 
	{
		boolean checkoddeven(int num) {
			boolean flag=true;
			if(num%2==0)
				flag=false;
			else
				flag=true;
			return flag;
		}
		int getSum(int[] input) {
			int sumeven=0,sumodd=0;
			
			for(int i=0;i<input.length;i++) {
				boolean flag=checkoddeven(input[i]);
				if(flag==false)
					sumeven=sumeven+input[i];
				else
					sumodd=sumodd+input[i];
			}
			return sumodd-sumeven;
		}
		
		public static void main(String[] args) {
			Differnceoddeven  oddeven=new Differnceoddeven ();
			
			int[] input = {10,11,15,6};
			System.out.println("difference of sum of all even numbers and odd numbers in given array : "+ Arrays.toString(input)+" --> "+oddeven.getSum(input));
		}
	}
