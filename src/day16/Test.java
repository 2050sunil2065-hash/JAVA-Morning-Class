package day16;

public class Test {


public static void main(String[] args) {
	System.out.println("main method");
	MethodDemo1 ob = new MethodDemo1();
	ob.sayHello();
	ob.greet("trump");
	
	String r = MethodDemo1.returnInfo();
	System.out.println(r);
	
	int m = MethodDemo1.findMax(5, 4);
	System.out.println(m);
}
}
