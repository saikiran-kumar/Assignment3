package Question18;

public class ThreadTester extends Thread {

	
	public void Run()
	{
		System.out.println("Thread Running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTester t= new ThreadTester();
		t.start();
		t.start();
	}

}
