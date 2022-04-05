package OopsPrograms;

 	public abstract class Abstraction {
	/* Abstraction(){
		System.out.println(" i am Abstraction Constructor");
	}*/
	 Abstraction(int i) {
		// TODO Auto-generated constructor stub
	}
	// TODO Auto-generated constructor stub
	
	  abstract void runing();
	public void work()
	{
		System.out.println("I AM ABSTRACTION CLASS1");
	}

	public static void main(String[] args)
	{
		Abstraction abs = new Abstraction(10){
			
			@Override
			public void runing() {
				System.out.println("I AM ABSTRACTION CLASS");
				// TODO Auto-generated method stub
				class name{
					 public void display() {
						 System.out.println(" hi am class");
					 }
				}
				name na= new name();
				na.display();
			}
		};
		abs.runing();
		abs.work();
		
			
		
	}

}

