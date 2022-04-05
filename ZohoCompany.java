package Oops;

public  class ZohoCompany implements Interface_Model,Interface_Model2 {
	
   //int VALUE =50;
	//int VALUE = 100;
	
	public static void main(String[] args) {
		
		
		ZohoCompany abs = new ZohoCompany();// dynamic Binding
		
		abs.many();
	//	abs.many();
		 	 
		
	}
	
	public void worked() {
		System.out.println(" i am interface");
	}

		
		
	  public void mani()
	 {
		  
			System.out.println(" i am MANi");

			
		}
	  public  void hour() {
  		System.out.println(" i am HOUR");

		}
		 
      public  void hours() {
    		System.out.println(" i am HOURS");

		}
      public void man()
 	 {
 			System.out.println(" i am MAN");

 			
 		}
 		 
       public  void time() {
     		System.out.println(" i am TIME");

 		}





	@Override
	public void many() {
		// TODO Auto-generated method stub
		Interface_Model2.super.many();
	}





	//@Override
	/*public void many() {
		// TODO Auto-generated method stub
		System.out.println(" i am current Interace");
		super.many();
	}*/
		
	}

	


