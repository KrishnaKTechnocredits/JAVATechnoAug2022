package technocredits.inteview;

public class Employee {

	Object m1() {
		Object obj = "technocredits";
		return obj;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		String str = (String)e.m1();
		System.out.println(str.length());
	}
}
