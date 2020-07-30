package day16;

public class MethodDemo1 {

	public static void sayHello() {
		System.out.println("hello");
		return ;
		
		

	}
	public void greet(String name) {
		System.out.println("Hello, " + name + ", Good Morning");
		
	}
public static String returnInfo() {
	String name = "Krishna Thapa";
	String address = "Kathamandu, Nepal";
	return name + " "+ address;
	
}
public static int findMax(int a, int b) {
	int max = 0;
	if(a>b) {
		max = a;
		
	}else {
		max = b;
	}
	return max;
}
}

