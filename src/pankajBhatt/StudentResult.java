package pankajBhatt;

/*Write a program to fulfill below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Any other range should be considered as invalid.*/

class StudentResult{
	
	void processResult(int score){
		if(score >=0 && score <= 100){
			if(score >=0 && score <= 49){
				System.out.println("Failed as obtained mark is : "+score+", work harder");
			}else if(score >=50 && score <= 100){
				System.out.println("Student could clear exam");
				}if(score >=90 && score <= 100){
					System.out.println("Score: "+score+", A+, very good job");
				}else if(score >=80 && score <= 89){
					System.out.println("Score: "+score+", A, good job");
				}else if(score >=70 && score <= 79){
					System.out.println("Score: "+score+", B+, you are improving");
				}else if(score >=60 && score <= 69){
					System.out.println("Score: "+score+", C+, keep reading");
				}else if(score >=50 && score <= 59){
					System.out.println("Score: "+score+", C, you can do better");
				}
		}else{
			System.out.println("Score invalid.");
		}	
	}
	
	public static void main(String[] args){
		StudentResult studentResult = new StudentResult();
		studentResult.processResult(49);
		studentResult.processResult(50);
		studentResult.processResult(60);
		studentResult.processResult(70);
		studentResult.processResult(80);
		studentResult.processResult(91);
		studentResult.processResult(90);
		studentResult.processResult(0);
		studentResult.processResult(-1);
		studentResult.processResult(101);

	}
}
