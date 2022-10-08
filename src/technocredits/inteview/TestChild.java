package technocredits.inteview;

public class TestChild {

	public static void main(String[] args) {
		Parent p = new Parent();
		Parent parent = p.getObject();
		Child2 child2 = (Child2)parent;
		child2.m1(); // child1 m1
	}
}
