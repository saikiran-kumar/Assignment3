package Question13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>(); 
		  l.add("sai");  
		  l.add("kiran");    
		  l.add("kumar");    
		  l.add("John");    
		  //traversing elements using Iterator  
		  Iterator itr=l.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  

	}
	}
}
