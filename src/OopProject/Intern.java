package OopProject;

public class Intern extends Employee {

	
	private int duration;
	
	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public Intern(String name, int id, double salary, int duration) {
		super(name, id, salary);
		this.duration = duration;
	}


	@Override
	public void roleJob() {
		System.out.println( "Intern for " + duration + "months");
	}
	

}
