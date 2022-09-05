/*Assignment - 5 : 24th Aug'2022
Program - 2: 
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
package adittyThakare.basicconcepts;

class StudentMarks{
	
	void processResult(int score){
		if(score>=0 && score<=49){
			System.out.println("Failed, as obtained marks are "+score+", work harder");
		}
		else if(score>=50 && score<=100){
			System.out.println("Student could clear exam.");
			if(score>=90 && score<=100)
				System.out.println("A+, very good job.");
			else if(score>=80 && score<=89)	
				System.out.println("A, good job.");
			else if(score>=70 && score<=79)	
				System.out.println("B+, you are improving.");
			else if(score>=60 && score<=69)	
				System.out.println("C+, keep reading.");	
			else if(score>=50 && score<=59)	
				System.out.println("C, you can do better.");	
		}
		else
			System.out.println("Invalid!!");
	}
	
	public static void main(String[] args){
		
		StudentMarks studentmarks = new StudentMarks();
		studentmarks.processResult(85);
		System.out.println("");
		studentmarks.processResult(66);
		System.out.println("");
		studentmarks.processResult(48);
		System.out.println("");
		studentmarks.processResult(120);
	}
}	
		
		
		