package gauravSahu.Practice;

public class Practice3 {

	static int num;
	String name;
	double d;

	Practice3(int num, double d, String name) {
		Practice3.num = num;
		this.d = d;
		this.name = name;
	}

	public static void main(String[] args) {
		Practice3 p3 = new Practice3(4, 5.7, "ABC");
		p3 = new Practice3(3, 1.2, "XYZ");
		System.out.println(Practice3.num + p3.d + p3.name);
	}
}
