/*Write a program to fulfill the below requirement.
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
package asthaSrivastava.assignments;

public class Result { //Program 2 24Aug22
	void processResult(int score){
		if(score>=50 && score<=100){
				System.out.println("Student could clear exam");
			if(score>=90 && score<=100){
				System.out.println("A+, very good job");
			} else if(score>=80 && score<=89){
				System.out.println("A, good job");
			}else if(score>=70 && score<=79){
				System.out.println("B+, you are improving");
			}else if(score>=60 && score<=69){
				System.out.println("C+, keep reading");
			}else if(score>=50 && score<=59){
				System.out.println("C, you can do better");
			}
		} else if(score>=0 && score<=49){
				System.out.println("Failed as obtained mark is "+score+", work harder");
			}else 
					System.out.println("Invalid Input");
				
	}		
	public static void main(String[] args){
			Result result = new Result();
			
			result.processResult(36);
			result.processResult(95);
			result.processResult(77);
			result.processResult(85);
			result.processResult(68);
			result.processResult(51);
			result.processResult(-98);
	}
}