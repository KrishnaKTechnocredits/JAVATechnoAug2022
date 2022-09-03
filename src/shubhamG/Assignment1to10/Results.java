package shubhamG.Assignment1to10;

/*
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

class Results{	

	void processResult(int score){
		if(score>=0 && score <50)
			System.out.println("Failed as obtained mark is " + score +", work harder");
			
		else if(score>=50 && score <=100){
			System.out.println("Student could clear exam");
			
			if(score>=90 && score <=100)
				System.out.println("A+, very good job");
			else if(score>=80 && score <90)
				System.out.println( "A, good job");
			else if(score>=70 && score <80)
				System.out.println( "B+, you are improving");	
			else if(score>=60 && score <70)
				System.out.println( "C+, keep reading");
			else
				System.out.println( "C, you can do better");					
			}		
		else
			System.out.println("Invalid Marks");
	} 

	public static void main(String[] args){
		Results results = new Results();
		
		results.processResult(36);
		results.processResult(90);
		results.processResult(55);
		results.processResult(85);
		results.processResult(101);
	}	
	
}