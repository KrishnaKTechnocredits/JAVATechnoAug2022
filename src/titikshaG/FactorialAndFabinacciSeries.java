package titikshaG;

import java.util.Scanner;
//Program 3 : Write a method to return factorial of user defined given number (using scanner class).
//input : 5
//output : 120

public class FactorialAndFabinacciSeries {
	public static int getFactorial(int num)
	{
		int index; int factorial=1;
			for(index=1;index<=num;index++) {
				factorial=factorial*index;}
				return factorial;}
	
//Program 4: Print fibonacci series till Nth number.
//input : 8
//output : 0 1 1 2 3 5 8 13
	 
	public static void getFibonnacciSeries(int num)
	{
		System.out.println("The Fibonnacci series of starting"+" "+ num +" "+ "number are: ");
		int fNum=0;int sTnum=1;
		for(int index=1;index<=num;++index) {
		System.out.print(fNum + " ");
		int nNum=fNum+sTnum;
		fNum=sTnum;
		sTnum=nNum;}
		
	}

	public static void main(String[] args){
		Scanner input2=new Scanner(System.in);
			System.out.println("Enter num:");
			int num=input2.nextInt();
		System.out.println("Factorial of "+num+ " is"+":"+getFactorial(num));
		
		System.out.println();
		FactorialAndFabinacciSeries.getFibonnacciSeries(8);}}
	

