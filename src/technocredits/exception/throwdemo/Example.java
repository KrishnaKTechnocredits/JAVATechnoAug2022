package technocredits.exception.throwdemo;

public class Example {
	
	public static void main(String[] args) throws Exception {
		new Example().m1();
		System.out.println("Very good");
	}
	
	void m1() throws Exception {
		String name = "Maulik M Kanani";
		try {
			m2(name);
		}catch(Exception e) {
			m2(name.substring(8)); // " Kanani"
		}
		System.out.println("Hard");
	}
	
	void m2(String name) throws Exception{
		
		try {
			m3(name.length());
		}catch(StringIndexOutOfBoundsException ae) {
			System.out.println("Hi");
		}catch(NullPointerException ne) {
			System.out.println("Hello");
		}
		System.out.println("Techno");
	}
	
	char m3(int index) {
		String str = "technocredits";
		try {
			return str.charAt(index);
		}finally {
			return 'a';
		}
	}
}
