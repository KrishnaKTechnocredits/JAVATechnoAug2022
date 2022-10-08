/*Assignment - 35:
Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
*/

package sagarY.Assignment35;

public class ExceptionHandling2 {
	
	int sumOfDigits(String str) {
		int sum =0;
		String[] arr = str.split(" ");
		
		for(int i=0;i<arr.length;i++) {
			String str1 = arr[i];
			for(int j=0;j<str1.length();j++) {
				try {	
					String s1=Character.toString(str1.charAt(j));
					sum = sum + Integer.parseInt(s1);
				}catch(NumberFormatException ne){
					j++;
				}catch(StringIndexOutOfBoundsException se) {
					j++;
				}				
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Program 2: return sum of all the digits from given String.");
		System.out.println("-----------------------------------------------------");
		
		String str = "'I have 15 years, 3 months of experience'";
		ExceptionHandling2 ex = new ExceptionHandling2();
		System.out.println("INPUT: "+str);
		int sum = ex.sumOfDigits(str);
		System.out.println("OUTPUT: Sum of All Integers from above string is: "+sum);
	}

}
