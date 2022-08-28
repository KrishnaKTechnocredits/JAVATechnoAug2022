package pallaviRaut;
/*
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

class StudentGradeInfo{

	void processResult(int score)
	{
		if (score>=0 && score<=49){
			
			System.out.println("Failed as obtained mark is "+score+", work harder");
			System.out.println("--------------------------------");	
		}
		else if (score>=50 && score<=100){
			System.out.println("Student clear exam with "+score+", marks");
			
			if (score>=91 && score<=100){
				System.out.println("You got Grade A+, very good job");
				System.out.println("--------------------------------");	
			}	
			else if (score>=81 && score<=90){
				System.out.println("You got Grade A, good job");
				System.out.println("--------------------------------");	
			}	
			else if(score>=71 && score<=80){
				System.out.println("You got Grade B+, You are improving");
				System.out.println("--------------------------------");	
			}	
			else if (score>=61 && score<=70){
				System.out.println("You got Grade c+, Keep reading");
				System.out.println("--------------------------------");	
			}
			else if (score>=51 && score<=60){
				System.out.println("Grade C, you can do better");
				System.out.println("--------------------------------");	
			}
		}
		else{
			System.out.println("Value entered "+score+" is an invalid score");
			System.out.println("--------------------------------");	
		}				
	}

	public static void main(String[] args)
	{
		StudentGradeInfo studentGradeInfo=new StudentGradeInfo();
		studentGradeInfo.processResult(95);
		studentGradeInfo.processResult(78);
		studentGradeInfo.processResult(101);
		studentGradeInfo.processResult(47);
		studentGradeInfo.processResult(89);
	}
}	
	