package Oops;

import java.util.concurrent.Callable;

 public  class Inner_Class  {
	
	Inner_Class()
	{
		System.out.println(" I AM MAIN METHODS");
	}
	

	int a=200;
void display()
 {
	Inner inner = new Inner();
	System.out.println(" I AM NORAML CLASS") ;
	//Inner inner = new Inner();
	
 }
    class Inner {
	Inner(){
	System.out.println(" I AM INNER CLASS 1");
	}
}
	public static void main(String[] args)

	{
	Inner_Class n = new Inner_Class();
		n.call();
		//Inner_Class.Inner out = n.new Inner();*/
		
		
		//in.display();
		
		
		//Inner_Class.Game in = new Inner_Class().new Game();
	//	Inner_Class.Game hod =new Inner_Class.Game();//.play();
		//hod.play();
		    
		// ANONYMOUS CLASS
		Inheritance  inh = new Inheritance  ()//outer class 
					{
			public void display2()
			{
				
			System.out.println("I AM ANONYMOUS CLASS");
			
			}
				};inh.display2();
				
		
	}
	private void mani() {
		// TODO Auto-generated method stub
		
	}
	// static Class
	  static class Game
	{
		 Game()
		 {
			 System.out.println("I AM STATIC CONSTRUCTOR");
		 }
		public void display2() {
			// TODO Auto-generated method stub
			
		}
		public void play()
		{
			 System.out.println("I AM STATIC METHODS ");
			//return "manojkumar";
			
		}
	}
	  // Methods Inner Class
	 public void call()
	 { 
		 int a=10;//default final 
		
		 System.out.println(" I AM METHOD"); 
	   class Outer_Class {
			// int b=100;
		
			 void function()
			 {
				
				 System.out.println(a);
				
				 System.out.println(Inner_Class.this.a);
				 System.out.println(" I AM INNER CLASS METHODS");
			 }
		 }
		 Outer_Class out = new Outer_Class();
		 out.function();
		
		
	 }
	
}
       
