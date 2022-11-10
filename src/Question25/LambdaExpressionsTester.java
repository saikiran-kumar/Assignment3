package Question25;

public class LambdaExpressionsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = (int x, int y)->System.out.println(x+y); 
		 
        System.out.print("result = ");
        t1.func(10,10); 
        t1.display();
		

	}

}
interface Test 
{ 
     void func(int x,int y); 
 
     default void display() 
    { 
         System.out.println("This is default method"); 
    } 
} 
