//Assignment-5b
//Mahesh Santoki
package maheshSantoki.startingExamples;

class StudentResult {
	void processResult(int score) {
		if (score >= 0 && score <= 49)
			System.out.println("Failed as obtained mark is " + score + ",work harder");
		else if (score >= 50 && score <= 100) {
			System.out.println("Student could clear exam");
			if (score >= 90 && score <= 100)
				System.out.println("A+, very good job");
			else if (score >= 80 && score <= 89)
				System.out.println("A,Good job");
			else if (score >= 70 && score <= 79)
				System.out.println("B+, you are improving");
			else if (score >= 60 && score <= 69)
				System.out.println("C+, keep reading");
			else if (score >= 50 && score <= 59)
				System.out.println("c, you can do better");
		} else
			System.out.println("Invalid number");
	}

	public static void main(String[] a) {
		StudentResult studentresult = new StudentResult();
		studentresult.processResult(36);
		studentresult.processResult(53);
		studentresult.processResult(64);
		studentresult.processResult(78);
		studentresult.processResult(87);
		studentresult.processResult(99);
		studentresult.processResult(111);
		studentresult.processResult(-12);

	}
}