package com.practice.InnerClasses;

class Outer{
	
	private long someVar;
	int val;
	
	class InnerClass{
		
		int val;
		void in() {
			int val = 10;
			
			System.out.println("someVar : " + someVar);//Accessible here
			System.out.println("Inside Inner's in...");
			System.out.println("Local val : " + val);
			System.out.println("Instance val : " + this.val);
			System.out.println("Outer's Instance val : " + Outer.this.val);
			
			
		}
	}
	
	void met() {
		
		InnerClass ref = new InnerClass();
		ref.in();
	}
	public static void main(String[] args) {
			
	//		new Outer().met();
		//in order to create a inner class object
			new Outer().met();
			System.out.println("---------------");
			new Outer().new InnerClass().in();
			//extracting a method of another class which has inner class
			new OuterClass().methodContaingInnerClass();
			//calling anonymous inner class
			AnonymousInnerClass i = new AnonymousInnerClass() { public void display() {System.out.println("Anonymous Inner Class");} };
		      i.display();
			
		}
}

// class in method of another class
class OuterClass {
	void methodContaingInnerClass() {
		boolean flag = false;//Effectively final starting with Java 8
		class Inner {
			void in() {
				System.out.println("Inside Inner's in...");
				System.out.println("flag : " + flag);
			}
		}
		//accessing the method of inner class in a method
		Inner ref = new Inner();
		ref.in();
	}
}

// anonymous inner class

abstract class AnonymousInnerClass {
	   public abstract void display();
	}



