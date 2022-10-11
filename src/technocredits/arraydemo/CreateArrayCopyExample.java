package technocredits.arraydemo;

public class CreateArrayCopyExample {

	static String[] copyArray(String[] arr) {
		String[] output =new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			output[index] = arr[index];
		}
		return output;
	}
	
	static void processData(String[] arr) {
		System.out.println(arr);
		String[] output = copyArray(arr);
		output[0] = "Maulik";
		System.out.println(arr[0]);
	}
	
	public static void main(String[] args) {
		String[] arr = {"Hi","Hello","Hi"};
		System.out.println(arr);
		processData(arr);
	}
}
