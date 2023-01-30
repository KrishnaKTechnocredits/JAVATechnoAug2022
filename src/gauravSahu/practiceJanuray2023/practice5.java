package gauravSahu.practiceJanuray2023;

public class practice5 {
	
	String name = "Gaurav";
	String middlename = "Kumar";
	String lastName = "Sahu";
	
	String studentInfo (String name1, String name2, String name3) {
		String name = "Garvis";
		
		System.out.println(this.name);
		System.out.println(name);
		System.out.println(name3);
		return name1 + name2 + name3;
	}
	
	public static void main(String[] args) {
		practice5 p5 = new practice5();
		String name = p5.studentInfo(p5.name, p5.middlename, p5.lastName);
		System.out.println(name);
	}
}
