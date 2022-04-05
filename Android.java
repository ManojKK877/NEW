package OopsPrograms;

  class Android  //superclass
{        
	
	    public  void update(String name) 
	               { // public call everywhere programs
		 
			System.out.println(name);
			
		 private   void security()
		           {// private within class
				System.out.println(" Security");
		          	}
		  void 	Camer() 
		            {// default modifier in same package only used 
				System.out.println(" Camer");
		            }
		  
		 protected void icons() { // protected is Access in same package and extends Inheritance
			 
				System.out.println(" Icons");
			}
}
		 
   




