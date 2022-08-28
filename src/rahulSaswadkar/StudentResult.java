/*
*Program - 2: *
Write a program to fulfil below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Any other range should be considered as invalid.
*/
package rahulSaswadkar;

class StudentResult{
	void processResult(int studentScore){
		if(studentScore >= 0 && studentScore < 50){
			System.out.println("Failed as obtained mark is " + studentScore + ", work harder");
		}
		else if(studentScore >= 50 && studentScore <= 100){
			System.out.println("Student could clear exam");
			if(studentScore >= 90 && studentScore <= 100){
				System.out.println("A+, very good job");
			}
			else if(studentScore >= 80 && studentScore <= 89){
				System.out.println("A, good job");
			}
			else if(studentScore >= 70 && studentScore <= 79){
				System.out.println("B+, you are improving");
			}
			else if(studentScore >= 60 && studentScore <= 69){
				System.out.println("C+, keep reading");
			}
			else if(studentScore >= 50 && studentScore <= 59){
				System.out.println("C, you can do better");
			}
		}
		else{
			System.out.println("Invalid Score");
		}
	}
	
	public static void main(String[] args){
		StudentResult studentResult = new StudentResult();
		studentResult.processResult(36);
		studentResult.processResult(92);
		studentResult.processResult(85);
		studentResult.processResult(78);
		studentResult.processResult(63);
		studentResult.processResult(50);
		studentResult.processResult(101);
		studentResult.processResult(-1);
		
		
	}

}