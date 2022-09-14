package harshadaJagtap;

public class Increment_Decrement {
	
	public static void main(String[] args) {
		int count=0;
		for(int index=0; index<10;index++) {
			if(index<3) {
				count++;
			}
			else if (index>3 && index <8) {
				count++;
				count++;
			}
		}
		System.out.println(count);
	}
}
