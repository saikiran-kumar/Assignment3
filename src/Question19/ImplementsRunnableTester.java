package Question19;

public class ImplementsRunnableTester implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementsRunnableTester i = new ImplementsRunnableTester();
		
		Thread t1 = new Thread(i);
		
		t1.start();
		

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Implements Runnbale Interface");
		
	}

}
