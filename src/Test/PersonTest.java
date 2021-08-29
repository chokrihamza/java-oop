package Test;

import domain.Person;

public class PersonTest {

	public static void main(String[] args) {
		
		Person person1=new Person("Jhon",300.5,false);
		System.out.println("the person name :"+person1.getName());
		person1.setName("Alex");
		//person.name="Smith";
		System.out.println("the person name :"+person1.getName());
		System.out.println("the person name :"+person1.getSalary());
		System.out.println(person1);
	}
	
	
	
	
}
