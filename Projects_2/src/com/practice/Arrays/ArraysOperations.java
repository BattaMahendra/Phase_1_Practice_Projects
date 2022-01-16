package com.practice.Arrays;

import java.util.Scanner;

public class ArraysOperations {
	static int largeNum(int[] myArray) {
		int max=myArray[0];
		for(int i=0;i<myArray.length;i++) {
			if(max<myArray[i]) {
				max=myArray[i];
			}
		}System.out.println("largest num in given array is");
		return max;
	}
	static int smallNum(int[] myArray) {
		int min=myArray[0];
		for(int i=0;i<myArray.length;i++) {
			if(min>myArray[i]) {
				min=myArray[i];
			}
		}System.out.println("smallest num in given array is");
		return min;
	}
	static void arrayAscending(int[] myArray) {
		int temp;
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[i]>myArray[j]) {
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
					
					
				}
			}
		}
		System.out.println("ascending order");
		for(int t:myArray) {
			System.out.print(t+" ");
		}
		System.out.println("second largest number ------->"+myArray[1]);
		System.out.println("third largest number ------->"+myArray[2]);
		
	}
	static void arrayDscending(int[] myArray) {
		int temp;
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[i]<myArray[j]) {
					temp=myArray[i];
					myArray[i]=myArray[j];
					myArray[j]=temp;
					
					
				}
			}
		}
		System.out.println("dscending order");
		for(int t:myArray) {
			System.out.print(t+" ");
		}
		
	}
	 public static void main(String[] args) {
			Scanner SC=new Scanner(System.in);
			int[] userArray=new int[5];
			for(int i=0;i<userArray.length;i++) {
				System.out.println("enter the "+i+"  element of user array");
				int s=SC.nextInt();
				userArray[i]=s;
			}
			SC.close();
			
			for(int y:userArray) {
				System.out.print(y+" ");
			}
			
			System.out.println("");
			System.out.println("_________________________________________");
			System.out.println("");
			System.out.println(largeNum(userArray));
			System.out.println("");
			System.out.println("_________________________________________");
			System.out.println("");
			System.out.println(smallNum(userArray));
			System.out.println("");
			System.out.println("_________________________________________");
			System.out.println("");
			arrayAscending(userArray);
			System.out.println("");
			System.out.println("_________________________________________");
			System.out.println("");
			arrayDscending(userArray);
			

}
}
