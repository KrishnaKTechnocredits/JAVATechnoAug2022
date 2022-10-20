package shraddhaRekhate.Assignment35;

import java.util.Scanner;

//Assignment - 35 : 7th Oct'2022
//Program 1 : return sum of all the numbers from given String.
//input : i have 15 years and 3 months of experience.
//output : 18
//Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
//if we couldn't covert string to int for any word, it throws NumberFormatException.
//

public class SumOfAllNumException {
	int sumOfAllNum(String str) {
		int sum=0;
		String[] str1=str.split(" ");
		
		for(int index=0;index<str1.length;index++) {
			try {
				int num=Integer.parseInt(str1[index]);
            	sum=sum+num;
            }catch(NumberFormatException nf) {
            	
            }
		}
				return sum;
	}

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String input=scanner.nextLine();
		SumOfAllNumException sumOfAllNumException=new SumOfAllNumException();
		System.out.println(sumOfAllNumException.sumOfAllNum(input));
		scanner.close();

	}

}
