package technocredits.collectionsdemo;

import java.util.HashSet;

public class Example11 {

	public static void main(String[] args) {
		String[] arr = {"Titiksha", "Monika", "Deepak", "Chaitanya", "Deepak", "Monika"};
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("Titiksha")); // true
		System.out.println(hs.add("Titiksha")); // false
		hs.add("Shraddha");
		hs.add("Maulik");
		hs.add("Pranjali");
		System.out.println(hs.size()); // 0 //1
		System.out.println(hs);
		
		for(String name : hs) {
			System.out.println(name + "--" + name.charAt(0));
		}
		
		HashSet<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(13);
		numberSet.add(13);
		numberSet.add(16);
		System.out.println(numberSet);
		
	}
}
