package com.practice.collections;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
		Collections col1 =new Collections();
		Collections col2 =new Collections();
		
		//creating arraylist of objects
		System.out.println("ArrayList");
		
		ArrayList<Collections> Objects=new ArrayList<Collections>();   
		
	      Objects.add(col1);//
	      Objects.add(col2);    	   
	      System.out.println(Objects);  
		
		//creating linkedlist
	 
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Mahendra");  
	      names.add("Manohar");  	      
	      Iterator<String> itr=names.iterator();  
	      //using has next method
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       
	      	} 
	      }  
	}

