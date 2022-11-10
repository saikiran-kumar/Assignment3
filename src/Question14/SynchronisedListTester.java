package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronisedListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
		        list.add("sai");
		        list.add("kiran");
		        list.add("kumar");
		 
		        synchronized(list)
		        {
		            
		            Iterator it = list.iterator();
		 
		            while (it.hasNext())
		                System.out.println(it.next());
		        }

	}

}
