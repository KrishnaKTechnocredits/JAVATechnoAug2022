package vinod.TestPrograme;

public class Divisibleby3and7 {
	void divisibleby3and7(int num1, int num2) {
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
		System.out.println("First three number which are divisibleby 3 and 7 are :");
		new Divisibleby3and7().divisibleby3and7(10,100);
		
	}

}
