/*Write a program to fulfil below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Anyother range should be considered as invalid.*/

package rashmiG;

class ScoreDetails{

	void processResult(int score){
		if(score>=50 && score<=100){
			System.out.println("Student has cleared the exam with the score "+score);
				if(score>=90 && score<=100)
					System.out.println("grade is A+, very good job");
				else if(score>=80 && score<=89)
					System.out.println("grade is A, good job");
				else if(score>=70 && score<=79)
					System.out.println("grade is B+, you are improving");
				else if(score>=60 && score<=69)
					System.out.println("grade is C+, keep reading");
				else if(score>=50 && score<=59)
					System.out.println("grade is C, you can do better");
		}
		else if(score>=0 && score<=49)
			System.out.println("Failed as obtained mark is "+score+", work harder");
		else
			System.out.println("score is invalid..");
	}
	
	public static void main(String[] args){
		ScoreDetails scoreDetails = new ScoreDetails();
		scoreDetails.processResult(0);
		scoreDetails.processResult(101);
		scoreDetails.processResult(-98);
		scoreDetails.processResult(67);
		scoreDetails.processResult(100);
	}
}



					