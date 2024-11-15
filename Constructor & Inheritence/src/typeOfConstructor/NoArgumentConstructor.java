package typeOfConstructor;

public class NoArgumentConstructor {
	//instant variable
	int rollno;
	String name;
	float marks;    
	//no argument constructor
	public NoArgumentConstructor() {
        	rollno=1;
        	name="jaydeep";
        	marks=91.90f;
        	
        }
        public static void main(String[] args) {
		   NoArgumentConstructor x=new NoArgumentConstructor();//no argument constructor call
		   System.out.println(x.rollno);
		   System.out.println(x.name);
		   System.out.println(x.marks);
		}
}
//here in the no argument constructor the value are assign and can't change .