package Question12;

public class FinallyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int d=10/0;
			
		}catch(ArithmeticException e)
		{
			System.out.println("Exception");
		}
		finally {
			System.out.println("finally executed");
		}

	}

}
