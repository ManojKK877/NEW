package Wrapper;

import java.util.Arrays;
import java.util.Comparator;

public class ListDemo {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str={
				"manoj","kumar","dinesh","raju","sathish"};
			/*for(String i:str)
				System.out.println(i);
			Arrays.sort(str);
			for(String i:str)
				System.out.println(i);*/
			
			Comparator 	 data =new DataStructure();
			Arrays.sort(str, data);
			for(String name:str)
			System.out.println(name);

	}

}
