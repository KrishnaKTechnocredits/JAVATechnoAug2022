/*
Assignment - 15 : 5th Sep'2022
Sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28
*/

package anujaD;

public class SumOfFirstPrimeNumber {

	int count=0;
	int sum =0;
	
	boolean checkPrime (int num) {
		
		int Index = 2;
		boolean flag=true;
		
		while(Index <= num/2) {
			if(num%Index == 0) {
				flag = false;
				 break;
			}
			Index++;
		}
				 if(flag == true) {
				count++;
				sum=sum+num;
				
			}
		return true;
	}
	int primeNum(int Iteration) {
		int num = 2;
		System.out.println("Sum of First " + Iteration + " prime numbers is: ");
		while (count < Iteration) {
			checkPrime(num);
			num++;
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfFirstPrimeNumber obj = new SumOfFirstPrimeNumber();
		int result = obj.primeNum(5);
		System.out.println(result);
	}

			 
	}	
	

