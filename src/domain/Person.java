package domain;

public class Person {
	private String name;
	private double salary;
	private boolean eliminate;

	// constructor 
	public Person(String name,double salary,boolean eliminate) {

		this.name=name;
		this.salary=salary;
		this.eliminate=eliminate;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isEliminate() {
		return eliminate;
	}

	public void setEliminate(boolean eliminate) {
		this.eliminate = eliminate;
	}

	public String toString() {
		return "The person name is: "+this.name
				+"the person salary: "+this.salary
				+"eliminate: "+this.eliminate;
	}




}
