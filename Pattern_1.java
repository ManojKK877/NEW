package Wrapper;

import Oops.Inner_Class;

public class Pattern_1 {
	
	public static void pattern()
	{ 
		int i,j;
		
        for(i=0;i<5;i++)
        {
        	for(j=0;j<5-i;j++)
        {
        	System.out.print(j);
        }
        System.out.println("");
        	
        	
        }
	}
	public static void pattern1()
	{ 
		int i,j;
		
        for(i=1;i<5;i++)
        {
        	for(int s=0;s<5-i-1;s++)
        		System.out.print(" ");
        	for(j=1;j<=i*2;j++)
        {
        	System.out.print(j);
        }
        System.out.println("");
        	
        	
        }
	}
	public static void pattern2()
	/*
* * * * * * 
 * * * * * 
  * * * * 
   * * * 
    * * 
     * 
    * * 
   * * * 
  * * * * 
 * * * * * 
* * * * * * 

	 	 */
	{ 
		int i,j,l;
		
        for(i=-5;i<=5;i++)
        {
        	if(i<0)
        	{
        		l=-i;
        		
        	}
        	else 
        		l=i;
        	
        	for(int s=0;s<5-l;s++)
        		System.out.print(" ");
        	for(j=0;j<l+1;j++)
        {
        	System.out.print("* ");
        }
        System.out.println("");
        	
        	
        }
	}
	public static void pattern3()
	/*
	      * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
* * * * * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 

	 */
	{ 
		int i,j,l,n = 5;
		
        for(i=-n;i<=n;i++)
        {
        	if(i<0)
        	{
        		l=-i;
        		
        	}
        	else 
        		l=i;
        	
        	for(int s=0;s<l;s++)
        		System.out.print("  ");
        	for(j=0;j<2*(n-l)+1;j++)
        {
        	System.out.print("* ");
        }
        System.out.println("");
        	
        	
        }
	}
	
	public static void main(String[] args)
	{
		/* Pattern_1 pa =new  Pattern_1();
		 pattern();*/
	
		   
		 
	}
}
