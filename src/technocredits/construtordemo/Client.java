package technocredits.construtordemo;

public class Client {
	public static void main(String[] args) {
		
	}
}

class Manager{
	public int x = 10;
	
	public static void main(String[] args) {
		
	}
}

class Employee{
	public static void main(String[] args) {
		Manager mng = new Manager();
		System.out.println(mng.x);
	}
}