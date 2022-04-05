package Oops;

 public  class Inheritance {
	int a=100;
	
	 public Inheritance(int i) {
		// TODO Auto-generated constructor stub
		// this();
		 System.out.println(" two Constructor"+i);
	}
	 public Inheritance() { 
		this(10);
	
		System.out.println(" one Constructor");
		// TODO Auto-generated constructor stub
	}



   static void display2() {// default modifier in same package only used 
			System.out.println(" Hi JavaInheritance1");
	 }
	 private  int value =10;
	 public int Value()
	 {
		 return this.value;
	 }
	 
	  final void display() { // public call everywhere programs
		System.out.println(" Hi Java");
	}
	 public void display1() {// private within class
			System.out.println(" Hi JavaOops");
		}
	 

	/* void display8() { // protected is Access in same package and extends Inheritance
			System.out.println(" Hi Java Single Inheritance");
		}*/
    public void manoj()
 {
	System.out.println(" i am manojkumar");
 }
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(" Hi Java");

	}

	 
}
