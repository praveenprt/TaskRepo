package Task17;

public class Patient implements Comparable<Patient>{

	private String name;
	private int priority;
	private int arrivalTime;
	
	private static int counter =0;
	
	public Patient(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
		this.arrivalTime = counter++;
	}




	@Override
	public int compareTo(Patient o) {
	
		if(this.priority !=o.priority) {
		}
		return Integer.compare(this.arrivalTime, o.arrivalTime);
		
	}




	@Override
	public String toString() {
		return "Patient [name=" + name + ", priority=" + priority + ", arrivalTime=" + arrivalTime + "]";
	}
	
	
	

}
