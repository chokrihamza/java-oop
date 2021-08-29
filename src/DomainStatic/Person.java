package DomainStatic;

public class Person {

	private int idPerson;
	private String name;
	private static int countPerson;
	public  Person(String name) {
		this.name=name;
		Person.countPerson++;
		this.idPerson=Person.countPerson;
	}
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getCountPerson() {
		return countPerson;
	}
	public static void setCountPerson(int countPerson) {
		Person.countPerson = countPerson;
	}
	@Override
	public String toString() {
		return "Person [idPerson=" + idPerson + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
