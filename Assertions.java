package Oops;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

System.out.println();
		System.out.println(" Enter the number");
		int a =scan.nextInt();
		assert(a==10): "No is not 10 Please Check";
		//if(a==10)
		System.out.println(" this number is equal");
		//if(a==10)*/
		/*Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the number");
		int a =scan.nextInt();
		try {
			
	  assert(a==10):test1();
            	  
		}
		catch(AssertionError ae){
			System.out.println(" Assertion Error Occured");
		}
		System.out.println(" It Is True");
		}

		
		
		
	

	   public  static int test1() {
		// TODO Auto-generated method stub
		//return(" Number is not 10 please check");
			System.out.println(" Number is not 10 please check");
			return 100;
			
	}
		

	/*public   static String test() {
		// TODO Auto-generated method stub
		return(" Number is not 10 please check");
			//System.out.println(" Number is not 10 please check");
		
	*/
		

	}
}
