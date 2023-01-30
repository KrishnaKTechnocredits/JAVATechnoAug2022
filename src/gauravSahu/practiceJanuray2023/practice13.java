package gauravSahu.practiceJanuray2023;

public class practice13 {

	public static void main(String[] args) {
		practice13 p13 = new practice13();
		
		String names = "Maulik Gaurav Hindavi Shubham Hindavi Shubham Titiksha Swati";
		names.toLowerCase();
		
		String[] arr = names.split(" ");
		
		boolean flag ; 
		for(int index = 0; index<arr.length; index++) {
			flag = true;
			for(int i = index+1;i<arr.length;i++) {
				if(arr[index].equals(arr[i]) && arr[index] != " ") {
					flag = false;
					arr[i] = " "; 
				}
			}if(flag && arr[index] != " ") {
				System.out.println(arr[index]);
				arr[index] = " ";
			}
			
		}
		
	}
}
