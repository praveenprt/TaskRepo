package OopProject;

public abstract class Employee {

	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee() {
	}
	
	public void details() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
	}
	
	
	public abstract void roleJob();
	
	
}
