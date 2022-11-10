package Question14;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList<String> c = new CopyOnWriteArrayList<String>();

    
    c.add("sai");
    c.add("kiran");
    c.add("kumar");

    System.out.println("Elements of synchronized ArrayList :");

    
    Iterator<String> it = c.iterator();

    while (it.hasNext())
        System.out.println(it.next());
}

	}


