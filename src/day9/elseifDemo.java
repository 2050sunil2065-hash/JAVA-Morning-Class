package day9;

public class elseifDemo {

	public static void main(String[] args) {
		int marks = 4;
		
if(marks < 0|| marks >=101) {
	System.out.println("invalid marks");
	
}else if(marks >=80 && marks <= 100){
	System.out.println("distiction");
}else if(marks >=70 && marks <=79) {
	System.out.println("first");
	
}else if(marks >=40 && marks <=49) {
	System.out.println("pass");
}else {
	System.out.println("fail");
	
}
System.out.println("more code");
	}
}
