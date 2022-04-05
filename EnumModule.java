package Oops;

 enum Module{
	 
		 
		 ARAVINDHAN(22)
		 {
			 public  void  aravi() 
			 {
			 System.out.println("hi am aravindhan");
			 }

			
		 };  
	
	 Module(int i) {
			// TODO Auto-generated constructor stub
		System.out.println(i);
		}
	public abstract void aravi();
	

 }
		class EnumModule{
		
		public static void main(String[] args)
		 {
	   int a=10,b=20,c;
	   c=a^b;
	   System.out.println(c);
	   
		System.out.println(" hi am main Method");
		Module mode = Module.ARAVINDHAN;
		mode.aravi();
		

		//System.out.println(enumm);
		
	}
	}
	 
	



