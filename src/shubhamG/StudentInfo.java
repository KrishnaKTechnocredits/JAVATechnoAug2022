package shubhamG;

class StudentInfo{	
	String name, middleName , surname, birhDate, address;
	int rollNo;
		
	void studentName( String name, String middleName,String surname){
		System.out.println(name + "\n" + middleName+ "\n" +  surname ); 
	}

	void studentOtherDetails(String birhDate,String address,int rollNo){
		System.out.println(birhDate + "\n" + address+ "\n" + rollNo ); 
	}

	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shubham","Santosh","Gupta");
		studentInfo.studentOtherDetails("18th Feb 1995","405, Global Lifestlye,Hinjewadi,pune",18);
	}
}