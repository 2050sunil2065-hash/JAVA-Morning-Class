package day7;

public class OperatorDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ternary Operator
		//?:
		int a = 4;
		int b =3;
		if(a>b) {
			System.out.println("a is greater than b");
			
		}else {
			System.out.println("b is greater than a");
			
		}
		String s = (a>b)? "a is greater than b" : "b is greater than a";
		System.out.println(s);
		boolean r =(a>b) ? true:false;
		System.out.println(r);
	}

}
