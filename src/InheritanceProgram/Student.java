package InheritanceProgram;

public class Student extends Person {
	
	int studentId;
	String course;
	
	public Student(String name,int age, int studentId, String course) {
		super(name,age);
		this.studentId = studentId;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student  [studentId=" + studentId + ", course=" + course + ", name=" + name + ", age=" + age + "]";
	}
	
	
	

}
