package day11;

public class ClassDemo {
	//method declaration
	public void sayHello() {
		System.out.println("hello from Nepal");
	}

	public static void main(String[] args) {
		System.out.println("main");
		//object creation
		ClassDemo ob = new ClassDemo();
		//method calling
		ob.sayHello();
		System.out.println("main end");
		
	}

}
