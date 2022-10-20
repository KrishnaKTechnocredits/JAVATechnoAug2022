/*
Assignment - 35 : 7th Oct'2022

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

package pranjaliV.assignment35;

public class ExceptionHandlingEx35 {

	int getSumNum(String sentence){
		String[] input =  sentence.split(" ");
		int sum = 0 ;

		for(int index=0; index<input.length; index++){
			try{
				sum = sum + Integer.parseInt(input[index]); // it will only parse if it is num 
			}
			catch(NumberFormatException ne){
			}
		}
		return sum;
	} 

	int getSumAllDigit(String sentence){
		String[] input = sentence.split(" ");
		int sum = 0;

		for(int index=0; index<input.length; index++){
			try{
				int num = Integer.parseInt(input[index]);// it will only parse if it is num 
				while(num>0){ // till num is > 0 
					sum = sum + num%10 ; //sum = sum + 15%10 = 0 + 5 = 5 --- adds 1 digit from the num
					num = num/10; // divides the num 10 to remove the last digit
				}
			}
			catch(NumberFormatException ne){
			}
		}
		return sum;
	}


	public static void main(String[] args) {
		ExceptionHandlingEx35 ex35 = new ExceptionHandlingEx35();

		System.out.println("---------------------------------------------");
		System.out.println("Program 1 : return sum of all the numbers from given String.");
		String input1 = "i have 15 years and 3 months of experience.";
		System.out.println("Input : " + input1);
		System.out.println("Output : " + ex35.getSumNum(input1));
		System.out.println("");


		System.out.println("---------------------------------------------");
		System.out.println("Program 2: return sum of all the digits from given String.");
		String input2 = "i have 15 years and 3 months of experience.";
		System.out.println("Input : " + input2);
		System.out.println("Output : " + ex35.getSumAllDigit(input2));
		System.out.println("");

	}
}
