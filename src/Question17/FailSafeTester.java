package Question17;

import java.util.ArrayList;
import java.util.Iterator;

public class FailSafeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al = new ArrayList<>();
	        al.add(1);
	        al.add(2);
	        al.add(3);
	        al.add(4);
	        al.add(5);
	  
	        Iterator<Integer> itr = al.iterator();
	        while (itr.hasNext()) {
	            if (itr.next() == 2) {
	                
	                itr.remove();
	            }
	        }
	  
	        System.out.println(al);

	}

}
