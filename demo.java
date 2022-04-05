package Oops;
import java.util.*;

class A{
	
	int a;
	int b;
	int c;
	
	A(int a, int b){
	
		
	}
	void fun(int b) {
	this.a = b;
	System.out.println(a);
	}
}
public class demo {

	public static void main(String[] args) {
		      int x = 10;
		      A obj = new A();
		      obj.a = 10000;
		       
		       //obj.fun(x);
		       
		       System.out.println(obj.a);
		
		
	}

}
