package technocredits.collectionsdemo.advance;

import java.util.TreeSet;

public class Test {

	void getSortedBuilderList() {
		TreeSet<Builder> listOfBuilders = new TreeSet<Builder>();
		listOfBuilders.add(new Builder("Rohan", 10, 100, "Pune"));
		listOfBuilders.add(new Builder("Kalpataru", 15, 150, "Pune"));
		listOfBuilders.add(new Builder("Madhik", 7, 200, "Surat"));
		listOfBuilders.add(new Builder("Pandit", 20, 20, "Ahd"));
		
		for(Builder b : listOfBuilders) {
			System.out.println(b.getName());
		}
	}
	
	public static void main(String[] args) {
		new Test().getSortedBuilderList();
	}
}
