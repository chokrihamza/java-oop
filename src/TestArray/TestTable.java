package TestArray;

import domain.Person;

public class TestTable {
  public static void main(String[] args) {
	int []array=new int[3];
	System.out.println(array);
	array[0]=10;
	array[1]=11;
	array[2]=12;
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	
	Person []persons=new Person[3];
	
	persons[0]=new Person("Jane",500,true);
	persons[1]=new Person("Stive",500,true);
	persons[2]=new Person("Jhon",500,true);
	for (int i = 0; i < persons.length; i++) {
		System.out.println(persons[i]);
		
	}
	// u can use this
	
	String fruits[]={"mango","banana"};
	for (String fruit : fruits) {
		System.out.println(fruit);
	}
	
}
		
}
