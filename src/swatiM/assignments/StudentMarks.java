//Write a program to fulfil below requirement.
//Create a method called processResult which should take score as a parameter.
//if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
//if score is between 50-100, print "Student could clear exam".
//if score is between 90-100, print "A+, very good job".
//if score is between 80-89, print "A, good job".
//if score is between 70-79, print "B+, you are improving".
//if score is between 60-69, print "C+, keep reading".
//if score is between 50-59, print "C, you can do better".
//Anyother range should be considered as invalid.
package swatiM.assignments;

class StudentMarks{
	
	void processResult(int score){
		if(score>=0 && score<=49)
		  System.out.println("Failed as obtained mark is : " +score+" work harder");	
		else if(score>=50 && score<=100)
		{
			System.out.println("mark is: " +score+"Student could clear exam");	
		
		if(score>=90 && score<=100)
			System.out.println("Greade is : A+, very good job");	
		else if(score>=80 && score<=89)
			System.out.println("Greade is : A, good job");
		else if(score>=70 && score<=79)
			System.out.println("Greade is : B+, you are improving");
		else if(score>=60 && score<=69)
			System.out.println("Greade is : C+, keep reading");
		else if(score>=50 && score<=59)
			System.out.println("Greade is : C, you can do better");
		}
		else 
			System.out.println("invalid range");
		}
	public static void main(String[] a){
	StudentMarks studentMarks = new StudentMarks();
	  studentMarks.processResult(75);
	  studentMarks.processResult(48);
	  studentMarks.processResult(55);
	  studentMarks.processResult(95);
	  studentMarks.processResult(-10);
	  studentMarks.processResult(100);
		}	
 }
