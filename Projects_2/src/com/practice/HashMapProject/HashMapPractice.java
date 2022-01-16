package com.practice.HashMapProject;


import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<String,String> ht=new Hashtable<String,String>();  
	      
	      ht.put("4","kettle");  
	      ht.put("5","queue");  
	      ht.put("6","Keep");  
	      ht.put("7","win");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> treeMap=new TreeMap<Integer,String>();    
	      treeMap.put(8,"mahi");    
	      treeMap.put(9,"hello");    
	      treeMap.put(10,"super");     
	      treeMap.keySet();
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      System.out.println(treeMap.values());
	      for(Map.Entry l:treeMap.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());  
	       treeMap.clear();
	      }    
	      
	   }  
}

