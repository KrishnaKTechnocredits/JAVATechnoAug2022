/* Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/

package gauravSahu;

public class Assignmnet35B {
	
	int getSum(String input) {
		int sum = 0;
		String[] str = input.split(" ");
		for(int i = 0; i<str.length;i++) {
			String word  = str[i];
			for(int j=0;j<word.length();j++) {
				
				try {
					char ch = word.charAt(j);
					sum = sum + Integer.parseInt(String.valueOf(ch));
				}catch(NumberFormatException ae) {
					
				}
			}
			
		}return sum;
		
	}
	

	public static void main(String[] args) {
		Assignmnet35B a35 = new Assignmnet35B();
		String input = " i have 15 years and 3 months of experience";
		int sum = a35.getSum(input);
		System.out.println("Given String is : " + input);
		System.out.println("Sum of character integer in given array : " + sum );
	}
}
