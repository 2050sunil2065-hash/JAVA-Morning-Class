package day13;

public class ThisDemo1 {
	//instatic variable
	int a= 5;
	//non-static method
	public void display() {
		System.out.println(a);
		//local variable
		int a= 6;
		System.out.println(a);
		int sum = a + this.a;
		System.out.println("sum is "+ sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ThisDemo1 ob1 = new ThisDemo1();
System.out.println("ob1 is " + ob1);
ob1.display();
System.out.println("---------");
ThisDemo1 ob2 = new ThisDemo1();
System.out.println(ob2);
ob2.display();

	}

}
