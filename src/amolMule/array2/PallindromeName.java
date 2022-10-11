package amolMule.array2;

public class PallindromeName {

	void getPallinddrome(String str) {
		int flag = 0;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch = str.charAt(i);
			char ch1 = str.charAt(j);
			if (ch != ch1) {
				System.out.println("Its Not Palindrome");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(" And Its Pallindome");
		}
	}

	public static void main(String[] args) {

		PallindromeName p = new PallindromeName();
		String str="RADAR";
		System.out.println("Given string is "+str);
		p.getPallinddrome(str);
	}

}
