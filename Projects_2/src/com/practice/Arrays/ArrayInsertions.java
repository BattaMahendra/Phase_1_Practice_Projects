package com.practice.Arrays;

import java.util.Scanner;

public class ArrayInsertions {
	static void inserElement(int[] arr , int position ,int element) {
		System.out.println();
		//if we want array elemnts to be retained along with new element
		int[] temp=new int[arr.length+1];
		int z=0;
		for(int i=0;i<=arr.length;i++) {
			if (i==position) {
				
				temp[position]=element;
				
			}
			else {
				temp[i]=arr[z++];			 
		}
		}
		System.out.println(" this is the result array");
		for(int s:temp) {
			System.out.print(s+" ");
		}		
	}
	static void deleteElement(int[] arr , int position ,int element) {
		System.out.println();
		//if we want array elemnts to be retained along with new element
		int[] temp=new int[arr.length-1];
		int z=0;
		for(int i=0;i<arr.length-1;i++) {
			if (i==position) {
				z++;
			}
			else {
				temp[i]=arr[z++];	
				 
		}
		}
		System.out.println(" this is the result array");
		for(int s:temp) {
			System.out.print(s+" ");
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
			System.out.println("enter the specified position");
			int pos=SC.nextInt();
			System.out.println("enter the element to be inserted");
			int ele=SC.nextInt();
			
			SC.close();
			System.out.println(" this is the given array");
			for(int y:userArray) {
				System.out.print(y+" ");
			}
			System.out.println("");
			inserElement(userArray, pos, ele);
			deleteElement(userArray, pos, ele);
			
}
}