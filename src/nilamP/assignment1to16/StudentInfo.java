/*Assignment - 5 : 24th Aug'2022

*Program-1: *
Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create a main method.
7. write a logic in the main method.
	a. Create an object of the StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

*Output example:
*
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34

*Program - 2:*
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
package nilamP.assignment1to16;

public class StudentInfo {
	void studentName(String name, String middleName, String surname) {
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}

	void studentDetails(String birthdate, String address, int rollNumber) {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	void processResult(int score) {
		if (score >= 0 && score <= 49) {
			System.out.println("Failed, as Marks obtained are: " + score + ", Work Harder");
		} else if (score >= 50 && score <= 100) {
			System.out.println("\n" + score + " Student could clear exam");
			if (score >= 90 && score <= 100) {
				System.out.println("A+, very good job");
			} else if (score >= 80 && score <= 89) {
				System.out.println("A, good job");
			} else if (score >= 70 && score <= 79) {
				System.out.println("B+, you are improving");
			} else if (score >= 60 && score <= 69) {
				System.out.println("C+, keep reading");
			} else if (score >= 50 && score <= 59) {
				System.out.println("C, you can do better");
			}
		} else {
			System.out.println("\nStudent Marks are: " + score + ", Invalid Range");
		}
	}

	public static void main(String[] args) {
		StudentInfo s = new StudentInfo();
		System.out.println("Assignment 5 output ");
		System.out.println("*** Program 1 output *** ");
		s.studentName("Shikha", "Amit", "Patel");
		s.studentDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.", 34);
		System.out.println(" *** Program 2 output ***");
		s.processResult(30);
		s.processResult(90);
		s.processResult(82);
		s.processResult(75);
		s.processResult(67);
		s.processResult(54);
		s.processResult(-50);
	}
}
