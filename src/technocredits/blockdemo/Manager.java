package technocredits.blockdemo;

public class Manager {
	static{
		System.out.println(1);
	}
	
	{
		System.out.println(2);
	}
	
	Manager(){
		super();
		System.out.println(3);
	}
}
