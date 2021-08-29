package TestPersonStatic;

import DomainStatic.Person;

public class TestPerson {
	private int counter;
	public static void main(String[] args) {
	
		Person person1=new Person("Jhon");
		Person person2=new Person("Smith");
		
		print(person1);
		print(person2);
		
	}
	
	public static void print(Person person) {
		System.out.println("person"+person);
	}
	
	public int getcounter() {
		print(new Person("Klara"));
		return this.counter;
	}

}
