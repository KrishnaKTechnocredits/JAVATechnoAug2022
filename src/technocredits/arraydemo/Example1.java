package technocredits.arraydemo;

public class Example1 {

	String m1(int x) {
		return "Maulik";
	}
	
	
	void printName() {
		String[] name = {"Maulik","Aashvi","Technocredits","Harsh"};
		System.out.println(name.length);
		for(int index=0;index<name.length;index++) {
			System.out.println(name[index]);			
		}
		System.out.println(name);
		System.out.println(name[0].length());
		System.out.println("Maulik \"Kanani\"");
	}
	
	// name -> array -> MA
	// name[0] -> 
	
	public static void main(String[] args) {
		System.out.println(new Example1().m1(10).length());
	}
}
