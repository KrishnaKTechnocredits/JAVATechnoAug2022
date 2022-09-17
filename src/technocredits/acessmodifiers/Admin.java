package technocredits.acessmodifiers;

public class Admin {
	private String regId = "GJ1212IO";
	
	int num = 10;
	void processAdmission(String firstname, String lastname, String address, 
			char hscGrade, char sscGrade, String stream, 
			boolean isMale) {
		
		Admin admin = new Admin();
		admin.insertStudentBasicDetails(firstname, lastname);
		admin.insertStudentAddress(address);
		admin.insertStudentGrade(sscGrade, hscGrade);
		admin.insertStudentStream(stream);
		admin.inserStudentGender(isMale);
	}
	
	private void insertStudentBasicDetails(String firstname, String lastname) {
		
	}
	
    private void insertStudentAddress(String address) {
		
	}
	
	private void insertStudentGrade(char sscGrade, char hscGrade) {
		
	}
	
	private void insertStudentStream(String stream) {
		
	}
	
	private void inserStudentGender(boolean isMale) {
		
	}
}
