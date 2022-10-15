package technocredits.collectionsdemo;

import java.util.Arrays;
import java.util.List;

// wrapper
public class Example13 {
	
	static void m1(List<Double> d) {
		List<Double> l1 = d;
		System.out.println(l1.get(0));
		l1.set(0,100.20);
		System.out.println(d.indexOf(100.20));
		System.out.println(d.get(0));
	}
	
	public static void main(String[] args) {
		
		Double[] d = {10.20,30.20,44.10,10.20};
		d[1] = 100.200;
		m1(Arrays.asList(d)); // insertion // deletion
		
		double[] d1 = {10.20,30.20,44.10,10.20};
		/*
		 * List<Double> list = new ArrayList<Double>(Arrays.asList(d));
		 * System.out.println(list); Set<Double> numberSet = new
		 * HashSet<Double>(Arrays.asList(d)); System.out.println(numberSet);
		 */
	}
}
