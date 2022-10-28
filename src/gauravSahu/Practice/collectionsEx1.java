/*ProductID,ProductCategory,Region,SaleAmount
1,Outdoor Recreation,Europe,4579
2,Clothing,Europe,4125
3,Costumes & Accessories,South Asia,6521
4,Athletics,South Asia,4125
5,Personal Care,Australia,5124
6,Arts & Entertainment,North AMerica,1245
7,Hardware,South America,456
8,Home & Garden,South America,241
9,Food,South Asia,1247
10,Home & Garden,South Asia,5462
11,Office Supplies,Australia,577*/

package gauravSahu.Practice;

import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class collectionsEx1 {
	
	void settable1(ArrayList<Integer> productID, ArrayList<String> productCategory){
		Map<Integer, String> table = new LinkedHashMap<Integer, String> ();
		for(int i=0;i<=productID.size()-1;i++) {
			table.put(productID.get(i), productCategory.get(i));
		}
		System.out.println("Set-Table : \n" + table);
	}
	
	void settable2(ArrayList<Integer> productID, ArrayList<String> productCategory,ArrayList<String> region) {
		Map<Integer, Map<String, List<String>>> table2 = new LinkedHashMap<Integer, Map<String, List<String>>>();
		for(int i = 0;i<productID.size()-1;i++) {
			
		}
	}
	
	
	public static void main(String[] args) {
		collectionsEx1 ex1 = new collectionsEx1();
		Integer[] pi  = new Integer[11]; 
		for(int i = 0; i<=10;i++) {
			pi[i] = i+1; 
		}
		System.out.println(Arrays.toString(pi));
		ArrayList<Integer> productID = new ArrayList<Integer>(Arrays.asList(pi));
		ArrayList<String> productCategory = new ArrayList<String>();
		productCategory.add("Outdoor Recreation");
		productCategory.add("Clothing");
		productCategory.add("Costumes & Accessories");
		productCategory.add("Athletics");
		productCategory.add("Personal Care");
		productCategory.add("Arts & Entertainment");
		productCategory.add("Home & Garden");
		productCategory.add("Food");
		productCategory.add("Home & Garden");
		productCategory.add("Office Supplies");
		productCategory.add("Home & Garden");
		productCategory.set(1, "NULL");
		ArrayList<String> region = new ArrayList<String>();
		region.add("Europe");
		region.add("Europe");
		region.add("South Asia");
		region.add("South Asia");
		region.add("Australia");
		region.add("North AMerica");
		region.add("South America");
		region.add("South America");
		region.add("South Asia");
		region.add("South Asia");
		region.add("Australia");
		productCategory.addAll(region);
		System.out.println(region);
		System.out.println(productCategory.equals(productID));
		System.out.println(productCategory.containsAll(productID));
		ArrayList<Integer> amount = new ArrayList<Integer>();
		amount.add(4579);
		amount.add(458);
		amount.add(651);
		amount.add(548);
		amount.add(459);
		amount.add(4564);
		amount.add(566);
		amount.add(4949);
		amount.add(497349);
		amount.add(4566);
		amount.add(4548654);
		System.out.println(productCategory);
		System.out.println(region);
		System.out.println(amount);
		ex1.settable1(productID,productCategory);
		ex1.settable2(productID,productCategory,region);
	}

}
