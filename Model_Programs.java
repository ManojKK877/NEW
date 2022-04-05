package Wrapper;

import Oops.Abstraction_Learn;

 public class Model_Programs{// extends Abstraction_Learn  {
	 
	/*Model_Programs() {
		super();
		// TODO Auto-generated constructor stub
	}*/

	int add(int b)
	{
		if(b==1)
			return 1;
		return b+add(b-1);
		
	}
	
	/*{
		System.out.println(" I am not Static Method ");
	}
	
   static    {
	System.out.println("Manoj");
}*/

	public static void main(String[] args) {
		Abstraction_Learn object = new Model_Programs();
		/*int result =object.add(5);
		System.out.print(result);
		//add();
		// TODO Auto-generated method stub
		/*Model_Programs object = new Model_Programs();
	    int  result =object.add(100,30);
		System.out.println(result);

	}

	private int  add(int  i, int j) {
		// TODO Auto-generated method stub
		return i+j;
		
	}*/

}

}