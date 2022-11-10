package Question13;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v=new Vector<String>();  
		  v.add("sai");
		  v.addElement("kiran"); 
		  v.addElement("kumar");  
		  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  

	}
	}

}
