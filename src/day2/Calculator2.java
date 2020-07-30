package day2;

import java.util.Scanner;

public class Calculator2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number1:");
	int a = input.nextInt();
	System.out.println("Enter number2:");
	int b = input.nextInt();
	int sum = a + b;
	int sub = a - b;
	int mul = a * b;
	int div = a/b;
	System.out.println("Addition of "+ a + " and "+ b + " is: " + sum);
	//Varaiable initialization and declaration//
	int b1 = 6;
	int m, n, o;
	//m = n = o = 6;//
	int m1 = 7, n1 = 8;
	
	
	input.close();
}
	
}