/*Test - 3 : 10th Sep'2022

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/

package rashmiG.programmingTestPrograms;

class Test3MiddleCharArray{
	
	char[] getMiddleCharFromStringArray(String[] inputArray){
		char[] outputArray=new char[inputArray.length];
		for(int index=0;index<inputArray.length;index++){
			int length=inputArray[index].length();
				if(length%2==0){
					outputArray[index]=inputArray[index].charAt(length/2-1);
				}
				else{
						outputArray[index]=inputArray[index].charAt(length/2);
				}
		}
		return outputArray;
	}
		
		
		
		public static void main(String[] args){
			String[] inputArray={"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
			char[] ans=new Test3MiddleCharArray().getMiddleCharFromStringArray(inputArray);
			for(int index=0;index<ans.length;index++){
				System.out.println(inputArray[index]+" -> "+ans[index]);
			}
		}
	}