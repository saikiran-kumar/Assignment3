package Question19;

public class ExtendsThreadsTester  extends Thread{
	
	public void run()
	{
		System.out.println("Extending Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendsThreadsTester t1 = new ExtendsThreadsTester();
		t1.start();
	}

}
