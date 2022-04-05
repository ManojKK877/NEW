package Oops;

public class Multithreading extends Thread{
	//extends Thread {
	
	/*public static void main(String[] args)
	{
		Multithreading mod = new Multithreading();
		mod.start();
	}*/
	 public  void run()
	{
	//Thread.yield();
//	try {
//		Thread.sleep(1000);
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	
		for(int i=0;i<=5;i++)
		System.out.println(" the chlid class" +i);
	}
	// Thread Expcetions is IllegalThreadState expcetions

}
