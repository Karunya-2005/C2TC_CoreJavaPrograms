package day6;

public class StudentDemo {
	static
	{
		System.out.println("before main");		
	}

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		Student s1=new Student();
		System.out.println(s1);
		Student s2=new Student();
		System.out.println(s2);
 
	}
    static
    {
    	System.out.println("hello static");
    }
}
