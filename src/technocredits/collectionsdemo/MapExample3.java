package technocredits.collectionsdemo;

import java.util.HashMap;

public class MapExample3 {
	
	public static void main(String[] args) {
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		hm.put('T',3);
		hm.put('e',1);
		
		if(hm.containsKey('t'))
			hm.put('t', hm.get('t')+1);
		else
			hm.put('t',1);
		
		System.out.println(hm.get('t')); // ??
	}
}
