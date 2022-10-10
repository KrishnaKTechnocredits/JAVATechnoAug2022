package technocredits.construtordemo;

abstract public class Parent {
	
	private int id;
	private String name;
	
	Parent(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	Parent(int id){
		this.id = id;
		this.name = "temp";
	}
	
	void display() {
		System.out.println("Parent id is " + id);
		System.out.println("Parent name is " + name);
	}
}
