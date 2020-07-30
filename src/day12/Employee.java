package day12;

public class Employee {
	String empName;
	int emId;
	public Employee() {
		System.out.println("default constructor..");
	}
public Employee(int id) {
	emId = id;
	System.out.println("arg constructor....");
	
}public Employee(String name){
	empName = name;
	System.out.println("arg constructor..");
}public Employee(int id, String name){
	emId = id;
	empName = name;
	System.out.println("arg constructor...");
}
public static void main(String[] args) {
	Employee e1 = new Employee();
	Employee e2 = new Employee(2,"sunil");
	Employee e3 = new Employee(22);
	System.out.println(""+e1);
	System.out.println("" +e2);
	System.out.println(""+e3);
}

}
