package Oops;
 


public class New_DemoThread {
	public static void main(String[] args) throws InterruptedException
	
	{
		/*Multithreading mod = new Multithreading();
		mod.start();*/
		Multithreading mult = new Multithreading();
		//mult.start();
		mult.join();
		System.out.println(mult.getState());
		mult.start(); 
		mult.setName("Customer" );
		System.out.println(mult.getName());
		System.out.println(mult.getState());
		mult.setPriority(1);
	System.out.println(mult.getPriority());
		for(int i=0;i<=5;i++)
		{
			
			//Thread.yield();
			System.out.println(" the main  methods "  +i);
		}
		//System.out.println(mult.getState());
		}

}
