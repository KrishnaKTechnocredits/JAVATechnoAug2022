package nikeshM.ReturnTypeNikesh;

//Program 1 : Write a method to return reverse name
//input : Maulik
//output : kiluaM

public class Return {
	String reverse(String name) {
		String reverseName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			reverseName = reverseName + name.charAt(index);		
		}
		return reverseName;
	}
		
	public static void main(String[] args) {
		System.out.print(new Return().reverse("Maulik"));
	}
}
