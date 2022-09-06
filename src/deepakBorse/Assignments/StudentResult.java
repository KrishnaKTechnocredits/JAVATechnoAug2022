/*Program - 2: *
Write a program to fulfil below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Any other range should be considered as invalid. */
package deepakBorse.Assignments;

class StudentResult{
	
	void processResult(int score){
		
		if(score>=0 && score<=49){
			System.out.println("Failed as obtained mark is "+score+" work harder");
		}
		else if(score>=50 && score<=100){
			System.out.println("Student cleared the exam with "+score+" score");
			
			if(score>=90 && score<=100){
				System.out.println("A+, very good job");
				
			}else if(score>=80 && score<=89){
				System.out.println("A, good job");
			
			}else if(score>=70 && score<=79){
				System.out.println("B+, you are improving");
			
			}else if(score>=60 && score<=69){
				System.out.println("C+, keep reading");
				
			}else if(score>=50 && score<=59){
				System.out.println("C, you can do better");
			}
		}else{
			System.out.println("Value entered is "+score+" which is invalid score");
		}
	}
	
	public	static void main(String[] args){
		
		StudentResult StudentResult1=new StudentResult();
		StudentResult1.processResult(99);
		StudentResult1.processResult(55);
		StudentResult1.processResult(89);
		StudentResult1.processResult(70);
		StudentResult1.processResult(68);
		StudentResult1.processResult(49);
		StudentResult1.processResult(-28);
	}
}