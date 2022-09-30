package gauravSahu.contructor;

public class Practice {
	
	{
		System.out.println("Block");//6//14
	}
	
	Practice(){//5//13
		System.out.println("1st Constructor");//7//15
	}
	
	Practice(int x){
		super();
		System.out.println(x + " : Gaurav");
	}
	
	Practice(String name){
		this();
	}
	
	void m1() {
		System.out.println("m1");
	}
	
	void m2() {
		System.out.println("m2");
	}
	
	
	public static void main(String[] args) {
		Practice p1=new Practice(50);
		Practice p2=new Practice("Garvis");
		p1.m1();
		p1.m2();
		p2.m2();
	}

}
