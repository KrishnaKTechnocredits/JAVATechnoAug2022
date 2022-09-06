package technocredits.loopexamples;

public class Example1 {

	void m1(int n) {
		int count = 0;
		int num = 1;
		
		while(count != n) {
			if(num%3==0 && num%7==0) {
				count++;
			}
			num++;
		}
		
		for(int number=1;count!=n;number++) {
			if(number%3==0 && number%7==0) {
				count++;
			}
		}
	}
	
	void processData() {
		int count = 0;
		for(int num=1; num<=100; num++) {
			if(num%13==0) {
				System.out.println(num);
				count++;
			}
		}
		System.out.println("There are total " + count + " div by 13");
	}
	
	void processData1() {
		int count = 0;
		int num = 1;
		while(num<=100) {
			if(num%13==0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("There are total " + count + " div by 13");
	}
}
