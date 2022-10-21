package technocredits.collectionsdemo.advance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

public class Product {
	
	private String productName;
	private int productPrice;
	private int productId;
	private String originLocation;
	private char productCategory;
	private Date productOriginDate;
	private String productOriginDateText;
	
	public Date getProductOriginDate() {
		return productOriginDate;
	}

	public Product(String productName, int productPrice, int productId, String originLocation, char productCategory, String dateText) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productId = productId;
		this.originLocation = originLocation;
		this.productCategory = productCategory;
		this.productOriginDateText = dateText;
		
		SimpleDateFormat sdateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			productOriginDate = sdateFormat.parse(dateText);
		} catch (ParseException e) {
			System.out.println("Date is not in expected format");
		}
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public String getOriginLocation() {
		return originLocation;
	}

	public char getProductCategory() {
		return productCategory;
	}	
	
	public String toString() {
		return this.productName + "--" + this.originLocation + "--" + this.productPrice + "--" + this.productOriginDateText;
	}
}
