package com.Overloding;

public class Student {
	int id;
	String name;
	String add;
	String Schoolname;
             public void addStudent(int id,String name,String address) {
				id=id;
				name=name;
				address=add;
				System.out.println(id+" "+ name+" "+ address);

			}
             public void addStudent(int id ,String School) {
            	 id=id;
            	 name=name;
            	Schoolname=School;
            	System.out.println(id+"" +name+" "+ School);
             }
             public static void main(String[] args) {
				Student x= new Student();
				x.addStudent(1, "jaydeep", "viman nagar");
				x.addStudent(2, "rahul","lana");
			}
}
