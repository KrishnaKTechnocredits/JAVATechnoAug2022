//We need to do sum of first 5 prime number, using return keyword 
//output: (2 + 3 + 5 + 7 + 11) = 28


package hemanshi;
public class ReturnKeyword{

int count = 0;
static int sum = 0;

boolean primeNumbers(int n) {
	boolean primeFlag = true;
	int index = 2;
	while (index <= (n / 2)) {
		if (n % index == 0) {
			primeFlag = false;
			break;
		}
		index++;
	}
	if (primeFlag) {
		count++;
		sum = sum + n;
	}
	return true;
}

int printFirst(int N) {
	int num = 2;
	System.out.println("Sum of First " + N + " Prime numbers are");
	while (num >= 2 && count < N) {
		primeNumbers(num);
		num++;
	}
	return sum;
}

public static void main(String[] args) {

	new ReturnKeyword().printFirst(5);
	System.out.println(sum);
}
}
