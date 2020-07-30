package day12;

public class User {
String name;
int age;
public User(String n, int a) {
	name = n;
	age = a;
	System.out.println("constructor is called....");
	
}
public void printInfo() {
	System.out.println("user name is:" + name);
	System.out.println("user age is:" + age);
	
}
public static void main(String[]args) {
	User user1 = new User("ram", 22);
	user1.printInfo();
	System.out.println("---------");
	User user11 = new User("sunil", 26);
	user11.printInfo();
}
		
	}


