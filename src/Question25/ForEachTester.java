package Question25;

import java.util.ArrayList;
import java.util.List;

public class ForEachTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();  
        l.add("Sai");  
        l.add("Kiran");  
        l.add("Kumar");  
        
        System.out.println("--------List-------");  
        l.forEach(sub -> System.out.println(sub));  

	}

}
