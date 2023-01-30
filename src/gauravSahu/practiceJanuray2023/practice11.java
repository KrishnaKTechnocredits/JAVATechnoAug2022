package gauravSahu.practiceJanuray2023;

public class practice11 {
	
	String getRevString(String name) {
		String revName = "";
		for(int index = name.length()-1; index>=0;index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
	
	void getSumOfDigits(String name) {
		int sum = 0 ;
		for(int index = 0 ; index<name.length()-1;index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}System.out.println(sum);
	}
	
	public static void main(String[] args) {
		practice11 p11 = new practice11();
		String name = "Ga2u1ra9v";
		String revName = p11.getRevString(name);
		System.out.println(revName);
		new practice11().getSumOfDigits(name);
	}

}
