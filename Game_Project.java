package OopsPrograms;
import java.util.*;
public class Game_Project {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      /*  Scanner scan =new Scanner(System.in);
		            System.out.println("Select your choices : ");
		        System.out.println(" 1.Addition\n 2.Subractions\n 3.Mutliplication\n 4.Divison");
		            
		            int choice=scan.nextInt();
		        System.out.println("enter the two values :");
		             int a=scan.nextInt();
		            int b=scan.nextInt();
		            System.out.println("Select your choices : ");
		            String choice1=scan.next();
		         
		           
		           
		            // integer value used
		        switch(choice)
		        {
		            case 1: 
		                System.out.println(a+b);
		                break;
		               
		            case 2:   
		            	 
		    switch(choice1)
		        {
		       
		            case "Addition" :
		                System.out.println(a+b);
		                break;
		                default:
		                System.out.println("check number");
		                break;
		            case "Subractions":
		                System.out.println(a/b);
		                break;
		            case "Mutliplication":
		                System.out.println(a%b);
		                break;
		            case "Divison":
		                System.out.println(a*b);
		                break;
		              
		        }
		            case 3:
		                System.out.println(a%b);
		                break;
		            case 4:
		                System.out.println(a*b);
		                break;

		        }
		       /* switch(choice)
		        {
		            case "Addition" :
		                System.out.println(a+b);
		                break;
		            case "Subractions":
		                System.out.println(a/b);
		                break;
		            case "Mutliplication":
		                System.out.println(a%b);
		                break;
		            case "Divison":
		                System.out.println(a*b);
		                break;

		        }*/
		       /* switch(choice)
		        {
		            case Addition": 
		                System.out.println(a+b);
		                break;
		            case "Subractions":
		                System.out.println(a/b);
		                break;
		            case "Mutliplication":
		                System.out.println(a%b);
		                break;
		            case "Divison":
		                System.out.println(a*b);
		                break;

		        }

		    }
		    
		}*/

      Scanner scan = new Scanner(System.in);
      System.out.println("1,2,3,4");
       System.out.println(" Choice Your Number");
       int n= scan.nextInt();
      // int a,b;
      

       switch(n)
       {
       case 1:
    	   {
    	   System.out.println(" 1.Addition\n 2.Subractions\n 3.Mutliplication\n 4.Divison");
    	   System.out.println("Enter the Your Operator"); 
    	   int c=scan.nextInt();
    	   switch(c) {
    	   case 1:
    		   System.out.print(n*n);
    		
    	     break;
    	   case 2:
    		   System.out.print(n-n);
    		   break;
    	   
       case 3:
		   System.out.print(n/n);
		   break;
		
	   
	 case 4:
		   System.out.print(n+n);
		   break;
		
	   }
    	    
    	 //  Sysetm.out.println("Enter the Your Operator");
    	   break;
    	   }
       case 2 :
    	   
    	   System.out.print(2);
    	   System.out.println(" 1.Addition\n 2.Subractions\n 3.Mutliplication\n 4.Divison");
    	   System.out.println("Enter the Your Operator"); 
    	   int c=scan.nextInt();
    	   switch(c) {
    	   case 1:
    		   System.out.print(n*n);
    		
    	     break;
    	   case 2:
    		   System.out.print(n-n);
    		   break;
    	   
       case 3:
		   System.out.print(n/n);
		   break;
		
	   
	 case 4:
		   System.out.print(n+n);
		   break;
		
	   }
    	   
       
    	   break;
       case 3:
    	   System.out.print(3);
    	   break;
       case 4:
    	   System.out.print(4);
    	   break;  
    	   
       }
       
	}
}


