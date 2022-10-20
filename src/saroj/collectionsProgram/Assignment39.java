package saroj.collectionsProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Assignment39 {

	void getDuplicateName(String[] nameArray) {
		HashSet<String> hashSet = new HashSet<String>();
		ArrayList<String> ans = new ArrayList<>();
		for (String name : nameArray) {
			if (!hashSet.add(name)) {
				ans.add(name);
			}
		}
		System.out.println("Duplicate name is: " + ans);
	}

	void uniqeName(String[] nameArray) {
		HashSet<String> hashSet = new HashSet<String>();
		ArrayList<String> arrayList = new ArrayList<>();
		for (String name : nameArray) {
			if (hashSet.add(name)) {
				arrayList.add(name);
			}
		}
		System.out.println("Unique names are: " + arrayList);
	}

	Set<Character> getUniqueCharacter(String name) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int index = 0; index < name.length(); index++) {
			set.add(name.charAt(index));
		}
		return set;
	}

	void removeDuplicateUsingInsertion(Integer[] numbers) {
		LinkedHashSet<Integer> linkedHash = new LinkedHashSet<>();
		for (Integer num : numbers) {
			linkedHash.add(num);
		}
		System.out.println("Modified list: " + linkedHash);
	}

	void removeDuplicateUsingNaturalOrder(Integer[] numbers) {
		TreeSet<Integer> treeset = new TreeSet<>();
		for (Integer num : numbers) {
			treeset.add(num);
		}
		System.out.println("Modified list in sorted order: " + treeset);
	}

	void getDuplicateNumbersUsingSet(Integer[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		LinkedHashSet<Integer> newSet = new LinkedHashSet<Integer>();
		for (Integer num : numbers) {
			if (!set.add(num)) {
				newSet.add(num);
			}
		}
		System.out.println("Duplicate numbers from given array are: " + newSet);
	}

	void getDuplicateNumbersUsingList(Integer[] numbers) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(numbers));
		List<Integer> newList = new ArrayList<Integer>();
		for (Integer num : list) {
			if (list.indexOf(num) != list.lastIndexOf(num) && !newList.contains(num)) {
				newList.add(num);
			}
		}
		System.out.println("Duplicate numbers from given array are: " + newList);
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		String[] str = { "Maulik", "Umesh", "Saroj", "Umesh" };
		assignment39.getDuplicateName(str);
		System.out.println("======================================================");

		String[] str1 = { "Maulik", "Umesh", "Saroj", "Umesh", "Umesh", "Saroj" };
		assignment39.uniqeName(str1);
		System.out.println("======================================================");

		String name = "technocredits";
		Set<Character> ch = assignment39.getUniqueCharacter(name);
		System.out.println("Uniqe characters are: " + ch);
		System.out.println("======================================================");

		Integer[] num = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		assignment39.removeDuplicateUsingInsertion(num);
		System.out.println("======================================================");

		Integer[] num1 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11 };
		assignment39.removeDuplicateUsingNaturalOrder(num1);
		System.out.println("======================================================");

		Integer[] num2 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		assignment39.getDuplicateNumbersUsingSet(num2);
		System.out.println("======================================================");

		Integer[] num3 = { 10, 10, 13, 12, 12, 10, 55, 66, 55, 11, 11 };
		assignment39.getDuplicateNumbersUsingList(num3);
	}
}
