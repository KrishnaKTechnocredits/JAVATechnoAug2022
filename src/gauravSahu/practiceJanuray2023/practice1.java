/*3 Number which is divided by 3 & 7*/
package gauravSahu.practiceJanuray2023;

public class practice1 {
	int count;
	void getNumber(int num1, int num2) {
		System.out.println("Given range" + num1 + num2);
		for(int index = num2; index>=num1; index--) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
			}
			if(count==3) {
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		practice1 p1 = new practice1();
		p1.getNumber(10,200);
	}

}
