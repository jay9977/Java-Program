package typeOfConstructor;
 
public class ParameteriesConstructor {
	//instance veriable
	int id;
	String name;
	float marks;
    //parameteries constructor
	public ParameteriesConstructor(int rollno,String nav,float takke ) {
    	 id= rollno;
    	 name=nav;
    	 marks=takke;
     }
     public static void main(String[] args) {
		ParameteriesConstructor x= new ParameteriesConstructor(1,"jaydeep",88.40f);//pass parameter
		System.out.println(x.name);
		System.out.println(x.id);
		ParameteriesConstructor y= new ParameteriesConstructor(2,"Rahul",76.6f);//pass parameter
		System.out.println(y.name);
		System.out.println(y.marks);;
	}  
	
}
