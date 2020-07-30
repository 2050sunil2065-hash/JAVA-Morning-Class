package day9;

public class NestedifElsedemo {

	public static void main(String[] args) {
		int a=9;
		int b= 7;
		int c=8;
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest one");
			}else {
				System.out.println("c is largest");
			}
			
		}else {
			System.out.println("b is greater than a but c may be smaller or greater than a");
			
		}

	}

}
