package gauravSahu.practiceJanuray2023;

public class practice18 {
	
	public static void main(String[] args) {
		String str = "Maulik Maulik Hindavi Shubham Hindavi Shubham Titiksha Swati";
		
		String [] arr = str.split(" ");
		
		for(int i = 0; i<arr.length;i++) {
			boolean flag =  true;
			int count = 1 ; 
			for(int j = i+ 1  ; j<arr.length;j++) {
				if(arr[i].equals(arr[j]) && i!=j) {
					count ++ ;
					arr[j] = " ";
					flag =  false;
				}
			}if(flag && arr[i]!=" ") {
				System.out.println(arr[i]);
			}
		}
	}

}
