package gauravSahu.practiceJanuray2023;

public class practice6 {
	
	void evenChar(String name) {
		for(int index = 0;index<name.length();index += 2) {
			System.out.println(name.charAt(index));
		}
	}
	
	void revOddChar(String name) {
		for(int index = name.length()-2;index>=0;index -= 2) {
			
			System.out.println(name.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		practice6 p6 = new practice6 ();
		String name = "GAURAVKUMARSAHU";
		p6.evenChar(name);
		System.out.println("-------------");
		p6.revOddChar(name);
		
	}

}
