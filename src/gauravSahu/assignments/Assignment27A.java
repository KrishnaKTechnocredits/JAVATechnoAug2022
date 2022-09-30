package gauravSahu.assignments;

public class Assignment27A {
	
	void getName(String[] name) {
		for(String name2 : name) {
			System.out.println("Name is " + name2);
			getUniWord(name2);
			System.out.println("------------------");
		}
	}
	
	void getUniWord(String name) {
		for(int index=0;index<name.length();index++) {
			char ch = name.charAt(index);
			int a = name.indexOf(ch);
			int b = name.lastIndexOf(ch);
			if(a==b) {
				System.out.println(ch);			
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27A a27 = new Assignment27A();
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		a27.getName(arr);
	}

}
