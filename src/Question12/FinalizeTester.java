package Question12;

public class FinalizeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeTester f= new FinalizeTester();
		System.gc();
		System.out.println("Garbage collector called");
		

	}
	
	protected void finalize() {
		System.out.println("Finalizer called");
		
	}

}
