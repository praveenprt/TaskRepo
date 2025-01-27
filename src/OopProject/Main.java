package OopProject;



public class Main {

	public static void main(String[] args) {
		
		Manager m1 = new Manager("Rohan",105,5000,"Manager");
		m1.details();
		m1.roleJob();
	
		Intern intern = new Intern("Rohit",115,2000,5);
		intern.details();
		intern.roleJob();
		
	
	}

	
}
