package saroj.exceptionHandling;

import java.util.Scanner;

public class Assignment35 {
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
		Assignment35 assignment35 = new Assignment35();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence: ");
		String sent = sc.nextLine();
		int sum = assignment35.getSumOfNumbers(sent);
		System.out.println(sum);
		System.out.println("============================================");
		System.out.println("Enter Sentence: ");
		String sentence = sc.nextLine();
		int add = assignment35.getSumOfDigits(sentence);
		sc.close();
		System.out.println(add);
	}
}
