package day12;

public class Student {

	
		String name;
		int roll;
		public void assignInfo(String name, int roll) {
			//name = n;
			//ro//ll = r;
		}
		
		
		public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.assignInfo("Sunil", 24);
		
		System.out.println(student1.name);
		System.out.println(student1.roll);
		
		
		Student student2 = new Student();
		student2.assignInfo("Deepesh", 25);
		System.out.println(student2.name);
		System.out.println(student2.roll);
		
	}

}
