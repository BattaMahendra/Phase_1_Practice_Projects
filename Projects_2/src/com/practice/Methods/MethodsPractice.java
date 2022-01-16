package com.practice.Methods;

public class MethodsPractice {
		
		 public static int multiply(int a,int b) {
				
		    	
				int prod=a*b;
				return prod;
			}

		 //call by value
			
			static int val=150;
			
			static int operation(int val) {
				val =val*10/100;
				return(val);
			}
	
			//method overloading
		
		   public static void area(int b,int h)
		    {
		         System.out.println("Area of Triangle : "+(0.5*b*h));
		    }
		    public static void area(int r) 
		    {
		         System.out.println("Area of Circle : "+(3.14*r*r));
		    }
		    
		    
		    public static void main(String[] args) {
				
				System.out.println("Multipilcation is :"+multiply(10,3));
				
				System.out.println("Before operation value of data is "+val);
				
				operation(100);
				
				System.out.println("After operation value of data is "+val);
				
			    area(10,12);
			    
			    area(5); 
				
				}
		
	   
}



