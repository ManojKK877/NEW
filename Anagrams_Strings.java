package OopsPrograms;
 import java.util.Scanner;
public class Anagrams_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		   
		       Scanner scan =new Scanner(System.in);
		       System.out.println("Enter the Name  ");
		        String value =scan.next();
		        String value1=scan.next();
		        //String Buffer Method used
		     // StringBuffer Names=new StringBuffer(value1);
		      // Names.reverse();
		       //if Condition 
		       if(value.contentEquals(value1))		     
		       {
		           System.out.println("This  is Anagrams ");
		       }
		        
		     else 
		        {
		        System.out.println("This is Not Anagrams");
		       }
		       
		       

	}

		   }
		

	


