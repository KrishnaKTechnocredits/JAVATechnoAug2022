/*Write a program to fulfil below requirement.
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Anyother range should be considered as invalid. */

package sagaryadav;
class Student{
	
	void marksObtained(int score){
		
		if(score>0 && score<50)
			System.out.println("Sorry, you are failed as obtained marks are: "  + score + ". Please work hard next time");
		
		else if (score>=50 && score<=100)
			System.out.println("Student could clear exam. Marks are: " +score);{
				
				if(score>=50 && score<60)
					System.out.println("Grade : C, you can do better");
				
				else if (score>=60 && score<70)
					System.out.println("Grade : C+, Please keep reading");
				
				else if (score>=70 && score<80)
					System.out.println("Grade : B+, you are improving");
				
				else if (score>=80 && score<90)
					System.out.println("Grade : A, Good Job");
				
				else if (score>=90 && score<=100)
					System.out.println("Grade : A+, Very Good Job");
			}
		
	}	
		public static void main(String[] args){
		Student student = new Student();
		student.marksObtained(45);
		System.out.println("");
		student.marksObtained(96);
		System.out.println("");
		student.marksObtained(83);
		System.out.println("");
		student.marksObtained(73);
		System.out.println("");
		student.marksObtained(56);
		System.out.println("");
		student.marksObtained(65);
	}
	
	
}