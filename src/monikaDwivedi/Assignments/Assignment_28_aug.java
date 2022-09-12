/*user defined range, 20 and 100 ,
 print 1st 3 numbers divisible by 3 and 7*/
package monikaDwivedi.Assignments;

public class Assignment_28_aug {
	int num;
	int count = 0;
	void ThreeandSeven(int num1,int num2) {
		for(num=num1;num<num2;num++) {
			if(num%3==0 && num%7==0) {
				System.out.println("Number "+num+ " id divisible by 3 and 7");
				count++;
			}
			if(count>=3)
				break;
		}
	}
	public static void main(String[] args) {
		Assignment_28_aug assignment_28_aug = new Assignment_28_aug();
		assignment_28_aug.ThreeandSeven(20,100);
	}
}

//Test1_MonikaD
