package amolMule;

import java.util.ArrayList;

public class ArrCollection3 {

void removeMultipleOccurance(ArrayList<String> al) {
	
for(int i=0;i<al.size();i++) {
	String name=al.get(i);
	
	if(al.indexOf(name) != al.lastIndexOf(name)){
		int j=al.lastIndexOf(name);
		al.remove(j);
	}
}

System.out.println(al);

}
	
public static void main(String[] args) {
	
	ArrayList<String> al= new ArrayList<String>();
	al.add("Amit");
	al.add("Ajit");
	al.add("Ajay");
	al.add("Atul");
	al.add("Ajay");
	al.add("Atul");
	al.add("Amol");
	al.add("Amit");
	System.out.println(al);
	
	ArrCollection3 ar= new ArrCollection3();
	ar.removeMultipleOccurance(al);
	
	
	
}
	
	

}
