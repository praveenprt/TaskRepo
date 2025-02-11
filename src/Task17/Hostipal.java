package Task17;

import java.util.PriorityQueue;

public class Hostipal {

	private PriorityQueue<Patient> pq;
	
	public Hostipal() {
		pq = new PriorityQueue<>();
	}
	
	public void addPatient(String name, int priority) {
		pq.add(new Patient(name, priority));
	}
	
	public void attentPatient() {
	if(!pq.isEmpty()) {
		System.out.println("Attending "+pq.poll());
	}
		else {
			System.out.println("No patients to attend");
		}
	}
	
	public boolean hasPatients() {
		return !pq.isEmpty();
	}
	}
	
	
