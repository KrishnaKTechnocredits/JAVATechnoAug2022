/*Program - 2: 
Write a program to fulfil below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Anyother range should be considered as invalid.*/
package pranjaliV;

class Result{
	
	void procResult(int score){
		if(score>=0 && score<=49){
			System.out.println("Failed as obtained marks is " + score + ", work harder!");
		}
		else if (score>=50 && score<=100){
			System.out.println("Congratulation!,Student could clear the exam.");
			if (score>=90 && score<=100)
			System.out.println("Score : " + score + " - A+ , Very Good Job!");
			else if (score>=80 && score<=89)
			System.out.println("Score : " + score + " - A , Good Job!");
			else if (score>=70 && score<=79)
			System.out.println("Score : " + score + " - B+ , You are Improving!");
			else if (score>=60 && score<=69)
			System.out.println("Score : " + score + " - C+ , Keep Reading!");
			else if (score>=50 && score<=59)
			System.out.println("Score : " + score + " - C , You can do better!");
		}
		else{
			System.out.println(score + " - Is a Invalid score!");
		}
	}
	
	public static void main(String[] args){
		Result result = new Result();
		result.procResult(90);
		result.procResult(80);
		result.procResult(70);
		result.procResult(60);
		result.procResult(50);
		result.procResult(35);
		result.procResult(0);
		result.procResult(105);
	}
}