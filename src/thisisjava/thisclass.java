package thisisjava;

public class thisclass {

	public static void main(String[] args) {
	 Person person1=new Person("hamza","chokri");
	 System.out.println("person1 : "+person1);
	 System.out.println(person1.lastname);
	 System.out.println(person1.firstname);
	 
	 new Print(person1);

	}

}

class Person{
	String firstname;
	String lastname;
	
	 Person(String firstname,String lastname){
		
		this.firstname=firstname;
		this.lastname=lastname;
		
	}
	
}


class Print{
	
	
	Print(Person person){
		//super();
		System.out.println("the value of this: "+this);
		System.out.println("the value of person: "+ person);
	}
	
	
}