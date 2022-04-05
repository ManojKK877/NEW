package Wrapper;

import java.util.Arrays;
import java.util.Comparator;

public class DataStructure implements Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /* int[] no= {9,3,18,2,1};
        for(int i:no)
        	System.out.println(i);
        Arrays.sort(no);
        for(int i:no)
        	System.out.println(i);*/
        	
	}

	@Override  
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String  s1= o1.toString();
		String  s2= o2.toString();
		if(s1.length()>s2.length())
			return -1;
		else if(s1.length()<s2.length())
			return +1;
		else
		  return 0;
	}

}
