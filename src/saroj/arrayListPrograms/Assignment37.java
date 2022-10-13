package saroj.arrayListPrograms;

import java.util.ArrayList;

public class Assignment37 {

	void removeNameFrmArraylist(ArrayList<String> listOfName, String name) {
		while (listOfName.contains(name)) {
			listOfName.remove(name);
		}
		System.out.println("New name list: " + listOfName);
	}

	void removeMultipleOccur(ArrayList<Object> listOfName, String name) {
		int index = listOfName.indexOf(name);
		int lastIndex = listOfName.lastIndexOf(name);
		while(index != lastIndex) {
			listOfName.remove(lastIndex);
			lastIndex = listOfName.lastIndexOf(name);
		}
		System.out.println("New modified name list: " + listOfName);
	}

	void removeOccur(ArrayList<String> listOfIndex, String name) {
		for (int index = 0; index < listOfIndex.size(); index++) {
			name = listOfIndex.get(index);
			int index1 = listOfIndex.indexOf(name);
			int lastIndex = listOfIndex.lastIndexOf(name);
			if (index1 != lastIndex) {
				listOfIndex.remove(lastIndex);
			}
		}
		System.out.println("New modified name list: " + listOfIndex);
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Sagar");
		arrayList.add("Harshal");
		arrayList.add("Apurva");
		arrayList.add("Gaurav");
		arrayList.add("Sagar");
		arrayList.add("Deepak");
		arrayList.add("Rashmi");
		String name = "Sagar";
		assignment37.removeNameFrmArraylist(arrayList, name);
		System.out.println("====================================================================");

		ArrayList<Object> arrayList1 = new ArrayList<Object>();
		arrayList1.add("Sagar");
		arrayList1.add("Harshal");
		arrayList1.add("Sagar");
		arrayList1.add("Apurva");
		arrayList1.add("Gaurav");
		arrayList1.add("Sagar");
		arrayList1.add("Deepak");
		arrayList1.add("Rashmi");
		String name1 = "Sagar";
		assignment37.removeMultipleOccur(arrayList1, name1);
		System.out.println("====================================================================");

		ArrayList<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Sagar");
		arrayList2.add("Harshal");
		arrayList2.add("Sagar");
		arrayList2.add("Harshal");
		arrayList2.add("Apurva");
		arrayList2.add("Gaurav");
		arrayList2.add("Sagar");
		arrayList2.add("Gaurav");
		assignment37.removeOccur(arrayList2, arrayList2.get(0));
	}
}
