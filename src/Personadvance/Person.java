package Personadvance;

public class Person {
	private final int idPerson;
	private static int countPersons;
	// block of initatisaton
	static {
		System.out.println("block of static init");
		++Person.countPersons;
		//idPerson=10;
	}
	
	{
		System.out.println("block of non static init");
		this.idPerson=Person.countPersons++;
	}

	public Person() {
		System.out.println("execution of constructor");
	}

	public int getIdPerson() {
		return this.idPerson;
	}
	
	@Override
	public String toString() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("Person [idPerson=");
		builder.append(idPerson);
		builder.append("]");
		return builder.toString();
	}

}
