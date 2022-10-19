package technocredits.inteview;

public class Test5 {

	public static void main(String[] args) {

		System.out.println("Start");
		String str = "technocredits"; // sechnocreditt
		// "st+i+ hnocred +c+et"

		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			char ch1 = str.charAt(i); // 'c'
			char ch2 = str.charAt(j);// 'i'

			if (i == 0)
				str = ch2 + str.substring(i + 1, j) + ch1;
			else
				str = str.substring(0, i) + ch2 + str.substring(i + 1, j) + ch1 + str.substring(j + 1);
		}
		System.out.println(str);

	}
}
