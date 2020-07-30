package day12;

public class StaticNonStaticDemo {
	
	String nonstaticVar = "this is non static variable";
	static String staticvar = "this is static var";
	
	public void sayHello() {
		System.out.println("Hello from Nepal");
		
	}
	public static void sayHi() {
		System.out.println("hi from USA...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNonStaticDemo ob = new StaticNonStaticDemo();
		
		//ob.sayHello();
		//sayHi();//limited approach
		//StaticNonStaticDemo.
		sayHi();
		System.out.println(staticvar);
		System.out.println(StaticNonStaticDemo.staticvar);
		StaticNonStaticDemo.sayHi();//best approach//call by class

	}

}
