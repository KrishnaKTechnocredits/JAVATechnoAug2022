
/*********
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

 * ***********/

package mohiniA.Exception.Assignment35;

import java.util.Scanner;

public class SumOfNumbersOutOfString {
	
	int getSumOfNumbers(String sentence) {
		int sum = 0;
		int num = 0;
		String[] newSentence = sentence.split(" ");
		for (int index = 0; index < newSentence.length; index++) {
			try {
				num = Integer.parseInt(newSentence[index]);
				sum = sum + num;
			} catch (NumberFormatException nf) {
				continue;
			}
		}
		return sum;
	}

	int getSumOfDigits(String sentence) {
		String[] newSentence = sentence.split(" ");
		int sum = 0;
		int num = 0;
		for (int index = 0; index < newSentence.length; index++) {
			try {
				num = Integer.parseInt(newSentence[index]);
				while (num != 0) {
					int reminder = num % 10;
					num = num / 10;
					sum = sum + reminder;
				}
			} catch (NumberFormatException ex) {
				continue;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbersOutOfString obj35 = new SumOfNumbersOutOfString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input Sentence with digits: ");
		String sent = sc.nextLine();
		int sum = obj35.getSumOfNumbers(sent);
		System.out.println(sum);
		System.out.println("============================================");
		System.out.println("Enter Input Sentence with digits: ");
		String sentence = sc.nextLine();
		int add = obj35.getSumOfDigits(sentence);
		sc.close();
		System.out.println(add);
	}

}
