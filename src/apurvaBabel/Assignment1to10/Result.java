/*Assignment 5 :
*Program - 2:*
Write a program to fulfill the below requirement.
Create a method called processResult which should take score as a parameter.
If the score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
If the score is between 50-100, print "Student could clear exam".
if the score is between 90-100, print "A+, very good job".
if the score is between 80-89, print "A, good job".
if the score is between 70-79, print "B+, you are improving".
If the score is between 60-69, print "C+, keep reading".
if the score is between 50-59, print "C, you can do better".
Any other range should be considered as invalid.
*/

package apurvaBabel.Assignment1to10;

class Result{

	void processResult(int score){
		
		if (score >=50 && score <=100){
			System.out.println("Marks obtained are " + score + " ,Student could clear exam.");
			if (score >=90 && score <=100){
				System.out.println("Grade A+,very good job.");
			}else if (score >=80 && score<=89){
				System.out.println("Grade A,good job.");
			}else if (score >=70 && score <=79){
				System.out.println("Grade B+,you are improving.");
			}else if (score >=60 && score <=69){
				System.out.println("Grade C+,keep reading.");
			}else if (score >=50 && score <=59){
				System.out.println("Grade C,you can do better.");
			}
		}
		else if (score >=0 && score <=49){
			System.out.println("Failed as obtained marks are " +score+ ",work harder.");
		}else{
			System.out.println(score + " Invalid score.");
		}	
	}
	
	public static void main(String[] args){
		Result result = new Result();
		result.processResult(25);
		result.processResult(93);
		result.processResult(89);
		result.processResult(110);
		result.processResult(74);
		result.processResult(61);
		result.processResult(50);
		result.processResult(-5);
	}
}