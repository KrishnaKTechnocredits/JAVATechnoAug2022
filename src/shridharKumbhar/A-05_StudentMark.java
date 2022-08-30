//Day 5 Assignment1
//Student 50-100 Pass, 0-49 - Fail
// A++ (90-100),A(80-89),B(70-79),C(60-69),D(50-59)
package shridharKumbhar;

class StudentMark{

	void studentResult(int marks){
		if (marks >=50 && marks < 100){
			System.out.println("Congratulations you passed the examination..!!");
			if (marks>=90 && marks < 100){
				System.out.println("You secured "+marks+" Its A++ , Great");
			}else if (marks>=80 && marks < 89){
				System.out.println("You secured "+marks+" Its A , Good");
			}else if (marks>=70 && marks < 79){
				System.out.println("You secured "+marks+" Its B , need bad");
			}else if (marks>=60 && marks < 69){
				System.out.println("You secured "+marks+" Its C , need to improve");
			}else if (marks>=50 && marks < 59){
				System.out.println("You secured "+marks+" Its D , need lot effortrs");
			}	
		}else if (marks>=0 && marks < 50){
			System.out.println("You got " + marks + " failed the exam ");
		}else
			System.out.println("You Entered " +marks+ " Invalid input marks should be between 0-100");
	}
	
	public static void main(String[] a){
		StudentMark studentmark = new StudentMark();
		studentmark.studentResult(98);
		studentmark.studentResult(78);
		studentmark.studentResult(40);
		studentmark.studentResult(150);
		studentmark.studentResult(60);
		studentmark.studentResult(-15);
	}
}