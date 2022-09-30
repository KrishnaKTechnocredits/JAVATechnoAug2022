package deepakBorse.Practice;

public class Test {

	public static void main(String[] args) {
		new c3();

	}

}
class c1{
	public c1() {
		System.out.println(1);
	}
}
class c2 extends c1{
	public c2() {
		System.out.println(2);
	}
}
class c3 extends c2{
	public c3() {
		System.out.println(3);
	}
}