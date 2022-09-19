package technocredits.inheritance;

///Annotation
//If a Child class method has same name and parameter as that of a method of Parent class, compiler will start applying rules of method overriding...

public class Employee extends Manager {
	
	public void m1() {
		int x = 10;
		boolean flag = false;
		System.out.println("Hello flag" + (x + 20) + flag + "Maulik,");
		System.out.println(flag);
	}

	static boolean m1(String msg) {
		return false;
	}
}
