package technocredits.basicexamples;

public class TernaryExample {

	String processData(int num) {
		String temp = "";
		if(num > 10) {
			int x = 10;
			temp = "Hi";
		}else
			temp = "Hello";
		return temp;
	}
	
	void processData1(int num, int x) {
		System.out.println(num > 10 && num <15 ? "Hi" : "Hello");
		
		num = num > 10 && num <15 ? num : num+10;
	}
	
	
	
	
}
