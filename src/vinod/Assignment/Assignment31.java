//Write a method to find whether given String is pallindrome.

package vinod.Assignment;

public class Assignment31 {
	boolean getPallindrom(String name) {
		boolean flag = true;
		for (int i=0, j=name.length()-1; i<j; i++, j--) {
			if(name.charAt(i) !=name.charAt(j)) {
				flag = false;
			}
			
		}
		return flag;
	}
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String[] arr = {"radar","aabcbaa", "abcbc"};
		for (String name : arr) {
			boolean flag = assignment31.getPallindrom(name);
			if(flag)
				System.out.println("Its a Pallindrom String : " + name);
			if (flag == false)
				System.out.println("It is Not a Pallindrom String : "+ name);
		}
		
	}

}
