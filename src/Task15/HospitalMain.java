package Task15;





public class HospitalMain {
	public static void main(String[] args) {
		Hostipal hs = new Hostipal();
		
		hs.addPatient("Rohan", 2);
		hs.addPatient("Raj", 3);
		hs.addPatient("Aakash", 6);
		hs.addPatient("Harsh", 1);
		hs.addPatient("Sumit", 10);

	while(hs.hasPatients()) {
		hs.attentPatient();
	}
	}
	
	

}
