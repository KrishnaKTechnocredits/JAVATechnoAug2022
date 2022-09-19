package hardikBhatia.Assignments;

public class Assignment5StudentInfo {
	//*Program-1: *
	//Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
	void studentName(String name, String middleName, String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	void studentOtherDetails(String birthdate, String address, int rollNumber){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	//*Program - 2:*
	void processResult(int score){
		if(score >= 0 && score<= 49){
			System.out.println("Failed as obtained mark is "+ score +", work harder.");
		}else if(score >= 50 && score<= 100){
			System.out.println("Student could clear exam.");
			if(score >= 90 && score<= 100){
				System.out.println("A+, very good job.");
			}else if(score >= 80 && score<= 89){
				System.out.println("A, good job.");
			}else if(score >= 70 && score<= 79){
				System.out.println("B+, you are improving.");
			}else if(score >= 60 && score<= 69){
				System.out.println("C+, keep reading.");
			}else if(score >= 50 && score<= 59){
				System.out.println("C, you can do better.");
			}
		}else{
			System.out.println("Score Not Valid.");
		}
	}
	
	public static void main(String[] args){
		Assignment5StudentInfo studentInfo = new Assignment5StudentInfo();
		studentInfo.studentName("Hardik","Dineshbhai","Bhatia");
		studentInfo.studentOtherDetails("11 March 1992","13/Sukhsanti Society,Madodhar road, Waghodia, Vadodara.",1);
		
		studentInfo.processResult(90);
		studentInfo.processResult(30);
		studentInfo.processResult(70);
	}
}
