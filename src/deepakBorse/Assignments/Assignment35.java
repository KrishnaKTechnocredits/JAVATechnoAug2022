/*
 * Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling
 */
package deepakBorse.Assignments;

public class Assignment35 {
//Program 1 : return sum of all the numbers from given String.
	int getsumallnumbers(String str) {
		String[] strsplit = str.split(" ");
		int sum = 0;
		for (int index = 0; index < strsplit.length; index++) {

			try {
				sum += Integer.parseInt(strsplit[index]);

			} catch (NumberFormatException nfe) {
				nfe.getMessage();
			}

		}
		return sum;
	}

//Program 2: return sum of all the digits from given String.

	int getsumalldigit(String str) {
		String[] strsplit = str.split(" ");
		int sum = 0, num = 0;
		for (int index = 0; index < strsplit.length; index++) {

			try {
				num = Integer.parseInt(strsplit[index]);

			} catch (NumberFormatException nfe) {
				nfe.getStackTrace();
			}

			while (num > 0) {
				sum += (num % 10);
				num = (num / 10);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment35 assignment = new Assignment35();

		String str = "I have 15 years and 3 months of experience.";
		
		System.out.println("Given String : "+str);
		System.out.println("Sum of all numbers from given string : "+assignment.getsumallnumbers(str));

		System.out.println("Sum of all digit from given string : "+assignment.getsumalldigit(str));

	}
}
