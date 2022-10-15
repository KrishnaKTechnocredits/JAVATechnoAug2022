package technocredits.collectionsdemo;

import java.util.Arrays;
import java.util.List;

public class ArrayListReplaceAllOccurencesOfName {

	String[] getProcessedArrayList(List<String> listOfNames, String targetName, String replaceName) {
		int index = 0;
		String[] output=new String[listOfNames.size()];
		while (listOfNames.contains(targetName)) {
			index = listOfNames.indexOf(targetName);
			listOfNames.set(index, replaceName);
		}
		for(int i=0;i<listOfNames.size();i++) {
			output[i]=listOfNames.get(i);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		System.out.println("Before replace\n" + Arrays.toString(arr));
		List<String> input = Arrays.asList(arr);
		// List<String> input = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nAfter replace\n"
				+ Arrays.toString(new ArrayListReplaceAllOccurencesOfName().getProcessedArrayList(input, "Deepak", "Shivani")));
	}
}
