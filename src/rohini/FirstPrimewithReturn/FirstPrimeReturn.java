package rohini.FirstPrimewithReturn;
//Assignment 15- SUm of first 5 prime numbers using return keyword
public class FirstPrimeReturn {
	int count;
	int sum;
	boolean isPrimeReturn(int num) {
		boolean flag = true;
		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				flag = false;
				break;
			}
			index++;
		}
		if (flag == true) {
			count++;
			System.out.println(num);
			sum = sum + num;
		}
		return true;
	}
	int primeReturn(int number) {
		int num = 2;
		while (num >= 2 && count != number) {
			isPrimeReturn(num);
			num++;
		}
		System.out.println("Sum of first " + number + " Prime numbers is: ");
		return sum;
	}
	public static void main(String[] args) {
		int sumOfFirstNPrime = new FirstPrimeReturn().primeReturn(5);
		System.out.println(sumOfFirstNPrime);
	}
}
