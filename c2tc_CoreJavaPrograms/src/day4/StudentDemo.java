package day4;

public class StudentDemo {

	public static void main(String[] args) {
		Student st = Student.getObj();
		st.setSid(101);
		st.setSname("Teo");
		Student st1 = Student.getObj();
		System.out.println(st1);
		System.out.println(st);

	}

}
