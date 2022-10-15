package technocredits.exception.throwdemo;

public class Pub {

	void pubEntry(int age){
		if(age >=18) {
			System.out.println("Welcome sir");
		}else {
			throw new InvalidAgeException("Let me call your momma");
		}
	}
	
	public static void main(String[] args) {
		Pub pub = new Pub();
		pub.pubEntry(16);
		System.out.println("End");
	}
}
