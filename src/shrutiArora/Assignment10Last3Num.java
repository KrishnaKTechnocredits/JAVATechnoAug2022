package shrutiArora;
public class Assignment10Last3Num {
	void printLast3Num(int startRange , int endRange) {
		int count = 0;
		for(int num = endRange; num>=startRange;num--) {
			if(num%3==0 && num%7==0) {
				System.out.println(num);
				count++;
				if(count==3) {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Assignment10Last3Num assignment10Last3Num = new Assignment10Last3Num();
		System.out.println("*********************************************Last3Number_program*************************************");
		System.out.println("Output: ");
		assignment10Last3Num.printLast3Num(10, 200); 
	}
}