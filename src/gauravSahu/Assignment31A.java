package gauravSahu;

public class Assignment31A {

	boolean getPallindrom(String name) { // "radar","aabcbaa","abcabc"
		boolean flag = true;
		for (int i = 0, j = name.length() - 1; i < j; i++, j--) {
			if (name.charAt(i) != name.charAt(j)) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment31A a31 = new Assignment31A();
		String[] arr = { "radar", "aabcbaa", "abcabc" };
		for (String name : arr) {
			boolean flag = a31.getPallindrom(name);
			if (flag) 
				System.out.println("It is a pallindrom string : " +  name);
			if(flag == false)
				System.out.println("It is not a pallindrom string : " +  name);
		}
	}
}
