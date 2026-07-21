package day10;

import java.util.ArrayList;
import java.util.List;

public class StudentDriverApp {

	public static void main(String[] args) {
		List<Student> students=new ArrayList();
		Student s1=new Student(1,"Alice",59.5);
		Student s2=new Student(2,"Ben",69.5);
		Student s3=new Student(3,"Chris",79.5);
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		System.out.println(students);

	}

}
