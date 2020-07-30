package day12;

public class Debfnjdk {

	public static void main(String[] args) {
		StaticNonStaticDemo ob = new StaticNonStaticDemo();
   ob.sayHello();
   System.out.println(ob.nonstaticVar);

   StaticNonStaticDemo.sayHi(); 
   System.out.println(StaticNonStaticDemo.staticvar);
	}

}
