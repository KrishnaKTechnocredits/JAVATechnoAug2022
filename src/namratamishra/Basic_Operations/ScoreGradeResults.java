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
Any other range should be considered as invalid.*/

package namratamishra.Basic_Operations;

import java.util.*;

public class ScoreGradeResults {

	void processResult(int score) {

		if (score >= 0 && score <= 49)
			System.out.println("failed as obtained mark is " + score + ",work harder");
		else if (score >= 50 && score <= 100) {
			System.out.println("Student could clear Exam");
			if (score >= 90 && score <= 100)
				System.out.println("A+, Very good job");
			else if (score >= 80 && score < 90)
				System.out.println("A, good job");
			else if (score >= 70 && score < 80)
				System.out.println("B+, You are improving");
			else if (score >= 60 && score < 70)
				System.out.println("C+, Keep reading");
			else if (score >= 50 && score < 60)
				System.out.println("C, You can do better");
		} else
			System.out.println("Invalid Range");
	}

	public static void main(String[] args) {
		ScoreGradeResults sgr = new ScoreGradeResults();
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Marks obtained");
		int a = sc.nextInt();
		sgr.processResult(a);
		sc.close();

	}
}
