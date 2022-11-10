package Question1;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
  
        // instance of String type
        Test<String> sObj
            = new Test<String>("Saikiran");
        System.out.println(sObj.getObject());

	}
	
	
	

}
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}
