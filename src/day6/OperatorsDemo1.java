package day6;

public class OperatorsDemo1 {

	public static void main(String[] args) {
		//Arithmatic Operator 
		//+ - * /
		//precedence(priority) + -(low) * / % (high)
System.out.println(8/3);
System.out.println(8%3);
//Associativity: Left to right 
int a = 45 +  5 -4/2-7%2-2*3;
a = 4 + 5-2 -7%2 -2*3;

System.out.println(a);

	}

}
