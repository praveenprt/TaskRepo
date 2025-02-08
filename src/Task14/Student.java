package Task14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.PublicKey;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	 String name;
	 int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public static void serializeStudent(Student student , String filename) {
		try 
			(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename))){
				os.writeObject(student);
				System.out.println("Student object Serialized ");
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static Student deserializedStudent( String filename) {
		try 
			(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(filename))){
			return(Student)
					oi.readObject();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
	 public static void main(String[] args) {
	
		 String filename="student.txt";
		 
		 Student s1= new Student("Rohit", 65);
		 
		 serializeStudent(s1, filename);
		 
		 Student ds = deserializedStudent(filename);
		 if(ds != null){
			 System.out.println("Student object deserialized");
			 
			 System.out.println("Name "+ ds.name + ", Marks " +ds.marks);
		 }
		 
	}
	
	
	
	
	
	
	

}
