package technocredits.collectionsdemo.advance;

public class Example5 {

	public static void main(String[] args) {
		Example5 example5 = new Example5();
		int hashcode = example5.hashCode();
		System.out.println(hashcode);
		
		String str = "Aashvi";
		System.out.println(str.hashCode());
		
		str = "Maulik";
		System.out.println(str.hashCode());
		
		Integer x = 10;
		System.out.println(x.hashCode());
	}
}
