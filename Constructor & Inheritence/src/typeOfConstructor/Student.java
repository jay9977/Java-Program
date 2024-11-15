package typeOfConstructor;

public class Student {
       int id;
       String name;
       float marks;
       final String schoolname="Testing Shastra";
       public Student(int i,String n,float mrk) {
    	   id=i;
    	   name=n;
    	   marks=mrk;
    	   
       }
       public static void main(String[] args) {
    	Student std=new Student(1,"jaydeep",99.40f);
		Student std2=new Student(2,"rahul",56.2f);
		System.out.println(std.id);
		System.out.println(std.name);
		System.out.println(std.marks);
		System.out.println(std2.id);
		System.out.println(std2.name);
		System.out.println(std2.marks);
		System.out.println(std.schoolname);
	}
}
