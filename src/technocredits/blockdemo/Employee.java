package technocredits.blockdemo;

public class Employee extends Manager{
	static{
		System.out.println("GM");
	}
	
	{
		System.out.println("Techno");
	}
	
	Employee(){
		super();
		System.out.println("Credits");
	}
	
	public static void main(String[] args) {
		System.out.println("Hi");
		Manager mng = new Employee();
	}
}
