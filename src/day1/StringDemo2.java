package day1;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "Nepal";
		String s2 = "Nepal";
		String s3 = new String("Nepal");
		String s4 = new String("Nepal");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
System.out.println(s1.equals(s1));
System.out.println(s2.equals(s2));
System.out.println(s3.equals(s3));

String s5 ="nepal";
System.out.println(s1.equals(s5));
System.out.println(s1.equalsIgnoreCase(s5));


	}

}
