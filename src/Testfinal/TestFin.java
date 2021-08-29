package Testfinal;

import domain.Person;

public class TestFin {
public static void main(String[] args) {
	final int myVariable=10;
	System.out.println("myVarible = "+myVariable);
	//myVariable=12;
	final Person person1=new Person("jhon",200,true);
	//person1=new Person("Alex",500,true);
	person1.setName("Alex");
	System.out.println(person1);
	
}
	
	
	
}
