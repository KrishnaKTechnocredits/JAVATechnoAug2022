package technocredits.collectionsdemo.advance;

import java.util.ArrayList;
import java.util.Collections;

public class Consumer {

	ArrayList<Product> getProductDetails() {
		ArrayList<Product> listOfProduct = new ArrayList<Product>();
		listOfProduct.add(new Product("Bodywash",500,3452,"India",'B', "2020-05-23"));
		listOfProduct.add(new Product("Deo",2000,1212,"London",'A', "2019-11-25"));
		listOfProduct.add(new Product("Laptop",11100,2452,"US",'C', "2022-01-12"));
		listOfProduct.add(new Product("Mist",800,3002,"Germany",'D',"2012-12-13"));
		
		Collections.sort(listOfProduct, new ProductOriginDate());
		return listOfProduct;
	}
	
	public static void main(String[] args) {
		Consumer consumer = new Consumer();
		ArrayList<Product> listOfProduct = consumer.getProductDetails();
//		for(Product p : listOfProduct) {
//			System.out.println(p); // MA
//		}
		System.out.println(listOfProduct);
	}
}
