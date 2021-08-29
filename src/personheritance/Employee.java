package personheritance;

public class Employee extends Person {
     private int idEmployee;
     private double salary;
     private static int countEmployee;
    
     public  Employee() {
    	 //super() this call automatically
    	 this.idEmployee = ++countEmployee;
     }
     
	public Employee(String name,double salary) {
		//super(name);
		this();
		this.name=name;
		this.salary = salary;
		
	}
	public int getIdEmployee() {
		return idEmployee;
	}
	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [idEmployee=");
		builder.append(this.idEmployee);
		builder.append(", salary=");
		builder.append(this.salary);
		builder.append(", Person=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
     
	
	
	
	
	
}
