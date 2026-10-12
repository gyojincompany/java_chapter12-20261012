package collectionTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MainStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		Student stu1 = new Student();
		
		students.add(stu1);
		students.add(stu1);
		students.add(stu1);
		students.add(stu1);
		
		students.remove(2);
		
		Set<Student> setStudent = new HashSet<Student>();
		
		setStudent.add(stu1);
		setStudent.add(stu1);
		setStudent.add(stu1);
		setStudent.add(stu1);
		
	}

}
