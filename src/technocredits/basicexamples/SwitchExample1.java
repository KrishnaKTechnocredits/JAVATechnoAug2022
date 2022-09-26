package technocredits.basicexamples;

// String, Char , int --> Switch case
// we can't write condition as a case.
public class SwitchExample1 {
	
	String m1(int index) {
		
		switch(index) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("Weekday");
				break;
			case 6:
			case 7:
				System.out.println("Weekend");
				break;
			default:
				System.out.println("Invalid");
				break;
		}
		System.out.println("puja");
		return "Techno";
	}
	
	void getScore(int marks) {
		switch(marks) {
			case 100-80:
				System.out.println("Ok");
				break;
				
			default :
				System.out.println("Not ok");
		}
	}
	
	void processData(int dayIndex) {
		
		switch(dayIndex) {
				
			case 1:
				System.out.println("First day of the week");
				System.out.println("Have a workful day");
				break;
				
			case 2:
				System.out.println("Second day of the week");
				System.out.println("lot of meetings");
				break;
				
			case 3 : 
				System.out.println("Heavy workload, utilise your day wisely ");
				break;
			
			default :
				System.out.println("Invalid day index");
				break;
		}
	}
	
	public static void main(String[] args) {
		new SwitchExample1().m1(2);
	}
}
