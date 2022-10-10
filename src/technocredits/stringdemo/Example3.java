package technocredits.stringdemo;

public class Example3 {

	static String getConcat(String str, String content){
		String str1 = new String(str+content);
		return str1;
	}
	
	public static void main(String[] args) {
		/*
		 * String str1 = "techno"; str1.concat("credits"); str1.toUpperCase();
		 * str1.substring(2); System.out.println(str1.charAt(0));
		 */
		
		StringBuilder sb = new StringBuilder("techno");
		sb.append("credits");
		sb.replace(0, 2, "Maulik");
		System.out.println(sb);
	}
}
