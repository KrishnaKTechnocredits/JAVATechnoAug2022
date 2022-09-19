package gauravSahu.String;

public class String3 {
	
	String revString(String name) {
		String revname = "";
		for(int index=name.length()-1; index>=0;index--) {
			revname = revname + name.charAt(index);
		}
		return revname;
	}
	
	public static void main(String[] args) {
		String3 s1 = new String3();
		String name = s1.revString("Gaurav");
		System.out.print(name);
	}

}
