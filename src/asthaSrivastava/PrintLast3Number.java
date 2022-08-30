package asthaSrivastava;

public class PrintLast3Number {
	
	int count = 0;
	void isDivisbleby3And7(int start, int end){
		for(int num=end;start<=end;num--) {
			if(num%3==0 && num%7==0) {
				System.out.println("Number divisible by 3 and 7 is:" +num);
				count++;
				}
			if(count>=3)
			break;	
		}
	}
	
		public static void main(String[]args) {
			PrintLast3Number printNumber =new PrintLast3Number();
			printNumber.isDivisbleby3And7(10,200);
	}
}