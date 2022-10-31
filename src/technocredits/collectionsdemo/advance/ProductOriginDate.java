package technocredits.collectionsdemo.advance;

import java.util.Comparator;

public class ProductOriginDate implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getProductOriginDate().compareTo(o2.getProductOriginDate());
	}
}
