package technocredits.collectionsdemo.advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateComparision {

	public static void main(String[] args) throws ParseException {
		String product1Date = "2021-01-13"; // 07-13-2020
		String product2Date = "2020-05-11";
		
		SimpleDateFormat sdateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date product1OriginDate = sdateFormat.parse(product1Date);
		Date product2OriginDate = sdateFormat.parse(product2Date);
		
		if(product1OriginDate.compareTo(product2OriginDate) > 0) {
			System.out.println("Product2 created before Product1");
		}else {
			System.out.println("Product1 created before Product2");
		}
	}
}
