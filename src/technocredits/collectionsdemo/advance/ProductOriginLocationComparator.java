package technocredits.collectionsdemo.advance;

import java.util.Comparator;

public class ProductOriginLocationComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		return p1.getOriginLocation().compareTo(p2.getOriginLocation());
	}

}
