package hemanshi;

public class ReturnLength {
	int l;
	int getNameLength(String name) {
		l=name.length();
		return l;
	}

	public static void main(String[] args) {
		ReturnLength returnlength=new ReturnLength();
		returnlength.getNameLength("Hemanshi");
		System.out.println("Length of given string is "+ returnlength.l);
	}


}
