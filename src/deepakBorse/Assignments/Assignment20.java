/*Assignment - 20 : 10th Sep'2022

1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
		 
7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits*/

package deepakBorse.Assignments;

import java.util.Arrays;

public class Assignment20 {

	boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				prime = false;
			}
		}
		return prime;
	}

	int sumofNotPrime(int[] inputarray) {
		int sum = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (!isPrime(inputarray[i])) {
				sum = sum + inputarray[i];
			}
		}
		//System.out.println(sum);
		return (sum);

	}

	int sumofNotPrimeDiv5and7(int[] inputarray) {
		int sum = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (!isPrime(inputarray[i])) {
				if (inputarray[i] % 5 == 0 && inputarray[i] % 7 == 0)
					sum = sum + inputarray[i];
			}
		}
		//System.out.println(sum);
		return (sum);

	}

	int sumofAllEvennumber(int[] inputarray) {
		int sum = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (!isPrime(inputarray[i])) {
				if (inputarray[i] % 2 == 0)
					sum = sum + inputarray[i];
			}
		}
		//System.out.println(sum);
		return (sum);

	}

	int diffsumofAllEvenAndOddnumber(int[] inputarray) {
		int sume = 0, sumodd = 0, sum = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (!isPrime(inputarray[i])) {
				if (inputarray[i] % 2 == 0) {
					sume = sume + inputarray[i];
				}
				if (inputarray[i] % 3 == 0) {
					sumodd = sumodd + inputarray[i];
				}
				if (sume < sumodd) {
					sum = sumodd - sume;
					System.out.println(sumodd);
					return (sumodd);
				} else

					sum = sume - sumodd;
				//System.out.println(sume);
				return (sum);
			}
		}
		return sum;
	}

	int getVowelcount(String name) {
		int countvowel = 0;
		name=name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
					|| name.charAt(i) == 'u') {
				countvowel++;
			}
		}
		//System.out.println(countvowel);
		return (countvowel);
	}
	
	int[] vowelCountEachstr(String[] name) {
		int[] vowelcount= new int [name.length];
		
		for(int i=0;i<name.length;i++) {
			vowelcount[i]=getVowelcount(name[i]);
		}
		
		return (vowelcount);
	}
	
	String nameMaxLen(String[] name) {
		String maxname="";
		int maxlenstr=0;
	
		for(int i=0; i<name.length;i++) {
			if(maxlenstr<name[i].length()) {
				maxname=name[i];
			}
			
		}
			
		
		return maxname;
	}

	public static void main(String[] args) {

		int[] input1 = { 11, 13, 17, 22, 44 };

		Assignment20 Assignment20 = new Assignment20();
		int sumnotprime= Assignment20.sumofNotPrime(input1);
		System.out.println("Sum of not prime numbers from array "+Arrays.toString(input1)+" : "+sumnotprime);

		int[] input2 = { 11, 35, 17, 105, 44 };
		int sumnotprimediv=Assignment20.sumofNotPrimeDiv5and7(input2);
		System.out.println("Sum of not prime numbers from array and Divisible by 5 & 7 "+Arrays.toString(input2)+" : "+sumnotprimediv);

		int[] input3 = { 10, 11, 15, 6 };
		int sumofeven=Assignment20.sumofAllEvennumber(input3);
		System.out.println("Sum of all even numbers from array "+Arrays.toString(input3)+" : "+sumofeven);

		int[] input4 = { 10, 11, 15, 6 };
		int diffoddeven=Assignment20.diffsumofAllEvenAndOddnumber(input4);
		System.out.println("Difference between sum of all even and odd numbers from array "+Arrays.toString(input4)+" : "+diffoddeven);

		String singlestr = "maulik";
		int vowelcount = Assignment20.getVowelcount(singlestr);
		System.out.println("Vowels count in string " + singlestr + " : " + vowelcount);

		String[] arrystr = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("Vowel count of the string from Array is as follows ");
		int[] countvowel1=Assignment20.vowelCountEachstr(arrystr);
		for(int i=0; i<arrystr.length;i++) {
			System.out.println(arrystr[i]+" -> "+countvowel1[i]);
		}
		
		String[] arrystr1 = { "Ashish","Aditty","Manjiri","Ankita","Credits"};
		String maxname=Assignment20.nameMaxLen(arrystr1);
		
		System.out.println("Maximum length string from array"+Arrays.toString(arrystr1)+" : "+maxname);
		
	}

}
