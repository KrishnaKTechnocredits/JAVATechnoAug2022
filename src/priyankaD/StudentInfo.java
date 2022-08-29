package priyankaD;

class StudentInfo
{
    void studentName(String firstName,String middleName, String sirname)
	{ System.out.println(firstName);
	  System.out.println(middleName);
	  System.out.println(sirname);
	}
	
	void studentDetails(String address, String birthdate, int rollno)
	{ System.out.println(address);
	  System.out.println(birthdate);
	  System.out.println("Roll no.is"+rollno);
	 }
    
    public static void main(String[]args)
	{
	   StudentInfo studentInfo=new StudentInfo();
	   studentInfo.studentName("Vedant","Kashinath","Dhobale");
	   studentInfo.studentDetails("124/1 Yashodeep society Kondhwa,Pune","23 sept 1998",10);
	}
}
