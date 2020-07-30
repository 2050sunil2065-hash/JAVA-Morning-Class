package day10;

import java.util.Scanner;

public class ForLoopDemo {
	//global variable
	int a;

	public static void main(String[] args) {
		ForLoopDemo ob = new ForLoopDemo();
		System.out.println(ob);
		
Scanner input = new Scanner(System.in);
System.out.println("Enetr number:");
int n = input.nextInt();
//local variable
int sum = 0;
for(int i =1; i<=n;i++) {
 sum =  sum + i;
 
 System.out.println(i);
	
}
System.out.println("sum is:" + sum);
input.close();

	}

}
