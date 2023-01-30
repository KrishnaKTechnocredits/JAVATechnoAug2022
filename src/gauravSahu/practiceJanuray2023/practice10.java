package gauravSahu.practiceJanuray2023;

public class practice10 {
	
	void middleChar(String name) {
		char ch = ' ';
		for(int index = 0;index<name.length()-1;index++) {
			if(name.length()%2 ==0) {
				ch = name.charAt(name.length()/2-1) ;
			}else {
				ch = name.charAt(name.length()/2);
			}
		}System.out.println("Middle Char of : " + name + "  is  " + ch);
	}
	
	public static void main(String[] args) {
		String[] inputArray = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		practice10 p10 = new practice10();
		for(String name : inputArray) {
			p10.middleChar(name);
		}
	}

}
