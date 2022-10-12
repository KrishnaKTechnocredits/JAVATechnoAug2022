/*Assignment - 35 :
Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.
*/

package sagarY.Assignment35;

public class ExceptionHandling {
	
	int sumOfIntegers(String str) {
		int sum =0;
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			try {
				sum = sum + Integer.parseInt(arr[i]);				
			}catch(NumberFormatException ne){
				i++;
			}
		}
		return sum;
	}
	public static void main(String[] args){
		System.out.println("Program 1 : return sum of all the numbers from given String.");
		System.out.println("-----------------------------------------------------");
		
		String str = "'I have 15 years and 3 months and 25 days of experience'";
		ExceptionHandling ex = new ExceptionHandling();
		System.out.println("INPUT: "+str);
		int sum = ex.sumOfIntegers(str);
		System.out.print("OUTPUT: Sum of integers from above string is: "+sum);
	}

}
