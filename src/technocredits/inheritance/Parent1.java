package technocredits.inheritance;

public class Parent1 extends GrandParent{

	public String toString() {
		return "Hi";
	}
	
	void m1() {
		System.out.println("Hi");
	}
	/*
	 * boolean m2(int num) { for(int index=2;index<=num/2;index++) {
	 * if(num%index==0) { return false; } } return true; }
	 * 
	 * void m4() {
	 * 
	 * for(int index=2;index<10;index++) { if(index%7==0 || index%2==0) { continue;
	 * } System.out.println(index); } }
	 */
}
