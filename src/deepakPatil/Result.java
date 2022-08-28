package deepakPatil;

/*Write a program to fulfil below requirement.:
Create a method called processResult which should take score as a parameter.
if score is between 0-49 lets say 36, print "Failed as obtained mark is 36, work harder".
if score is between 50-100, print "Student could clear exam".
if score is between 90-100, print "A+, very good job".
if score is between 80-89, print "A, good job".
if score is between 70-79, print "B+, you are improving".
if score is between 60-69, print "C+, keep reading".
if score is between 50-59, print "C, you can do better".
Anyother range should be considered as invalid.*/

class Result {

	void processResult(int marks) {
		if (marks >= 0 && marks < 50)
			System.out.println("\n" + "Failed as obtained mark is " + marks + ", work harder");
		else if (marks > 50 && marks <= 100) {
			System.out.println("\n" + "Marks " + marks + ", Student could clear exam");

			if (marks > 89 && marks < 101)
				System.out.println("A+, very good job");
			else if (marks > 79 && marks < 90)
				System.out.println("A, good job");
			else if (marks > 69 && marks < 80)
				System.out.println("B+, you are improving");
			else if (marks > 59 && marks < 70)
				System.out.println("C+, keep reading");
			else if (marks > 49 && marks < 60)
				System.out.println("C, you can do better");
		} else
			System.out.println("\n" + marks + " is Invalid input");
	}

	public static void main(String[] args) {
		Result result = new Result();

		result.processResult(95);
		result.processResult(81);
		result.processResult(78);
		result.processResult(67);
		result.processResult(54);
		result.processResult(34);
		result.processResult(105);
	}
}