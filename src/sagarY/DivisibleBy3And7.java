package sagarY;

public class DivisibleBy3And7 {
	
	void divisibleBy3And7(int num1, int num2) {
		int count=0;
		for(int i=num1; i<=num2; i++) {
			if(i%3==0 && i%7==0) {
			System.out.println(i);
			count++;
			if(count==3)
				break;
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("First three number which are divisible by 3 and 7 are:");
		new DivisibleBy3And7().divisibleBy3And7(10,100);
	}

}
