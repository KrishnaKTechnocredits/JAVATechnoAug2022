package kiran.Assignment27.UniqueCharFromArray;

public class UniqueCharFromArray {
	void getUniqueCharFromArray(String[] input) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length();j++) {
				char ch=input[i].charAt(j);
				//System.out.println(ch);
				
				int index1=input[i].indexOf(ch);
				int index2=input[i].lastIndexOf(ch);
				
				if(index1==index2) {
					System.out.println(ch);
				}
				
			}
			System.out.println("----");
		}
	}
	void getFirstUniqueCharFromArray(String[] input) {
		
		for(int i=0;i<input.length;i++) {
			for(int j=0;j<input[i].length();j++) {
				char ch=input[i].charAt(j);
				//System.out.println(ch);
				
				int index1=input[i].indexOf(ch);
				int index2=input[i].lastIndexOf(ch);
				
				if(index1==index2) {
					System.out.println(ch);
					break;
				}
				
			}
			System.out.println("----");
		}
	}

	public static void main(String[] args) {
		UniqueCharFromArray obj=new UniqueCharFromArray();
		String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
		obj.getUniqueCharFromArray(arr);
		String[] arr1 = {"Maulik", "KananiK", "akanksha"};
		obj.getFirstUniqueCharFromArray(arr1);

	}

}
