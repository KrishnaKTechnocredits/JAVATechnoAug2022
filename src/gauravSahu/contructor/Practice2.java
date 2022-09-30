package gauravSahu.contructor;

public class Practice2 extends Practice {

	{
		System.out.println("Block2");//8//16
	}

	Practice2() {//4
		System.out.println("2nd Constructor");//9//17
	}

	Practice2(int x) {//11
		super();//12
		System.out.println(x + " : Gaurav");//18
	}

	Practice2(String name) {//2
		this();//3
		System.out.println(name);//10
	}

	void m1() {
		System.out.println("P2m1");
	}

	void m3() {
		System.out.println("P2m2");
	}

	public static void main(String[] args) {
		Practice2 p2 = new Practice2("Garvis"); //1
		Practice p3 = new Practice2(50);
		p2.m1(); 
		p2.m2();
		p2.m2();
		p3.m2();
		p2.m2();
		p3.m2();
	}
}
