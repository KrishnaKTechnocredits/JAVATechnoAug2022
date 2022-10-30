package technocredits.collectionsdemo.advance;

public class Test1 {

	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
		customer1.name = "Maulik";
		customer2.name = "Puja";
		System.out.println(customer1.equals(customer2));
	}
}
