package amolMule;

import java.util.ArrayList;

public class ArrCollection2 {

	void removeMultipleOccurance(ArrayList<String> al, String name) {
		while (al.contains(name) && al.indexOf(name) != al.lastIndexOf(name)) {
			int index = al.lastIndexOf(name);
			al.remove(index);
		}

		System.out.print(al);

	}

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Amit");
		ar.add("Ajay");
		ar.add("Atul");
		ar.add("Amit");
		ar.add("Amol");
		ar.add("Amit");
		System.out.println("Original arraylist is:  " + ar);

		ArrCollection2 ar2 = new ArrCollection2();
		ar2.removeMultipleOccurance(ar, "Amit");
	}

}
