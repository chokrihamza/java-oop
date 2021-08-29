package passparreference;

import person.Person;

public class PassParreference {
   public static void main(String[] args) {
	Person person1=new Person();
	person1.lastname="jhon";
	System.out.println(person1.lastname);
	getValeur(person1);
	System.out.println(person1.lastname);
	
}
   public static Person getValeur(Person person) {
	   person.lastname="alex";
	   return person;
   }
}
