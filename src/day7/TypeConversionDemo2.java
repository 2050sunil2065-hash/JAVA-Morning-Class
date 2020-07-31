package day7;

import java.util.Scanner;

public class TypeConversionDemo2 {
//implicit type casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//explicit conversion
//
//char c1 = 99;
//short s1 = 99;
//System.out.println(c1);
//
Scanner input = new Scanner(System.in);
System.out.println("enter a:");
double a =  input.nextDouble();
System.out.println("Enter b:");
double b1 = input.nextDouble();
System.out.println("Enter c:");
double c = input.nextDouble();

double s = (a + b1 + c)/2;
double area = Math.sqrt(s*(s-a)*(s-b1)*(s-c));
System.out.println("Area is:"+ area);
Math.pow(4, 2);
input.close();
int temp = (int) a;
double b=0;
a = b;
b = temp;


	}

}
