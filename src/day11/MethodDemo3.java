package day11;
import java.util.Scanner;


public class MethodDemo3 {
	public static  int sum() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = input.nextInt();
		System.out.println("Enter b:");
		int b = input.nextInt();
		input.close();
		
		int sum = a + b;
		return sum + 1;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int obj = sum() + 1;
		System.out.println("Sum is:"+ obj);

	}

}
