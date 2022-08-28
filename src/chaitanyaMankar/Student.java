/*Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Any other range should be considered as invalid. */

package chaitanyaMankar;
class Student
{
	void processResult(int score)
	{
		if(score > 0 && score < 49)
			{
				System.out.println("Failed as obtained mark is "+score);
			}
		else if(score >= 50 && score <= 100)
			{	
				System.out.println("Student could clear exam, Score: "+score);
				if(score >= 90 && score <= 100)
					{
						System.out.println("A+, Very Good Job, Score:  "+score);
					}
				else if(score >= 80 && score <= 90)
					{
						System.out.println("A, Good Job, Score:  "+score);
					}
				else if(score >= 70 && score <= 79)
					{
						System.out.println("B+, You are improving, Score:  "+score);
					}
				else if(score >= 60 && score <= 69)
					{
						System.out.println("C+, Keep Reading, Score:  "+score);
					}
				else if(score >= 50 && score <= 59)
					{ 
						System.out.println("C, You can do better, Score:  "+score);
					}
			}
		else
			{
				System.out.println("Invalid Range, Score:  "+score);
			}
	}
	
			
	public static void main(String[] args)
		{
			Student std = new Student();
			std.processResult(40);
			std.processResult(50);
			std.processResult(80);
			std.processResult(101);
			std.processResult(-20);
		}
		
}

