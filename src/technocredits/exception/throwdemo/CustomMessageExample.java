package technocredits.exception.throwdemo;

public class CustomMessageExample {

	void processData() {
		throw new NullPointerException("Its bez you must be calling method on null");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		CustomMessageExample customMessageExample = new CustomMessageExample();
		try {
			customMessageExample.processData();
		}catch(NullPointerException ne) {
			System.out.println(ne.getMessage());
		}
		System.out.println("end");
	}
}
