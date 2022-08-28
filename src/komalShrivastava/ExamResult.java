// Komal Shrivastava
// Assignment 5 - Program 2
package komalShrivastava;

class ExamResult {
	
	void processResult(int score) {
		if(score >= 50 && score <=100) {
			System.out.print("Student has cleared the exam. ");
			if(score >=90 && score <=100)
				System.out.println("Score "+score+ ": A+, very good job");
			else if(score >=80 && score <=89)
				System.out.println("Score "+score+ ": A, good job");
			else if(score >=70 && score <=79)
				System.out.println("Score "+score+ ": B+, you are improving");	
			else if(score >=60 && score <=69)
				System.out.println("Score "+score+ ": C+, keep reading");
			else if(score >=50 && score <=59)
				System.out.println("Score "+score+ ": C, you can do better");	
		}
		else if(score >=0 && score <=49) 
			System.out.println("Failed as obtained mark is "+score+", work harder");
		else
			System.out.println("Invalid score");
	}		
	
	public static void main(String[] args) {
		ExamResult examResult = new ExamResult();
		examResult.processResult(-8);
		examResult.processResult(49);
		examResult.processResult(95);
		examResult.processResult(0);
		examResult.processResult(101);
	}
}	