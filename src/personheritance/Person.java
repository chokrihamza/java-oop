package personheritance;

public class Person {
	protected String name;
	protected char gendre;
	protected int age;
	protected String direction;

	//
	public Person() {

	}
	public Person(String name) {
		this.name=name;
	}
	public Person(String name, char gendre, int age, String direction) {
		super();
		this.name = name;
		this.gendre = gendre;
		this.age = age;
		this.direction = direction;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGendre() {
		return this.gendre;
	}
	public void setGendre(char gendre) {
		this.gendre = gendre;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDirection() {
		return this.direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gendre=" + gendre + ", age=" + age + ", direction=" + direction + "]";
	}




}
