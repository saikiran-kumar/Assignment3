package Question10;

import java.sql.SQLException;

public class SuperClass {

	
	public void methodOfSuperClass()
    {
        System.out.println("Super class method is not throwing any exceptions");
    }
	
	static class SubClass extends SuperClass
	{
	    @Override
		public void methodOfSuperClass() throws ArrayIndexOutOfBoundsException
	    {
	        System.out.println("can be overrided with any unchecked Exception");
	    }
	    
	    class SubClassTwo extends SuperClass
	    {
	        @Override
			public void methodOfSuperClass() throws SQLException
	        {
	            System.out.println("we can't override with checked Exception");
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
