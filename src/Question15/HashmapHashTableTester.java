package Question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashmapHashTableTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(101,"sai");
        ht.put(101,"kiran");
        ht.put(102,"kumar");
        ht.put(103,"John");
        System.out.println("Elements of Hash table");
        for (Map.Entry m:ht.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
       
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(100,"sai");
        hm.put(103,"Kiran"); 
        hm.put(101,"Kumar");
        hm.put(102,"John");
        System.out.println("Elements of Hash Map");
        for (Map.Entry m:hm.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
	}

}
