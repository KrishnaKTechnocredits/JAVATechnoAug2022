package sanket;

public class Question {

	int num1 = 3;
	static int num2 = 4;
	int num3 = 2;
	static int num4;

 

	void processing() {
		num4 = num1 + num2 + num3;
		num1++;
		num2++;
		num3++;
	}

	void display() {
		System.out.println(num4);
	}
	

	public static void main(String[] args) {
		Question question = new Question();
		question.processing();
		question.processing();
		question.processing();
		question.display();
	}
}	
