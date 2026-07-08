package day4;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<String> names=new TreeSet();
		names.add("Alice");
		names.add("Frank");
		names.add("Chris");
		names.add("Ben");
		names.add("David");
		
		
		System.out.println(names);
		
		System.out.println("FY Attendance List");
		Set<Student> fyStudentsAttendance=new TreeSet(new RollNumberComparator());   //Asc order of roll number
		fyStudentsAttendance.add(new Student(18,"Chris",78.5));
		fyStudentsAttendance.add(new Student(45,"Rohit",88.5));
		fyStudentsAttendance.add(new Student(1,"Alice",98.5));
		fyStudentsAttendance.add(new Student(66,"Bharat",68.5));
		fyStudentsAttendance.add(new Student(98,"Tom",58.5));
		
		System.out.println(fyStudentsAttendance);
		
		System.out.println("FY Exam Seating List");
		Set<Student> fyExamSeatingArrangement=new TreeSet(new NameComparator());   //Asc order of name
		fyExamSeatingArrangement.add(new Student(18,"Chris",78.5));
		fyExamSeatingArrangement.add(new Student(45,"Rohit",88.5));
		fyExamSeatingArrangement.add(new Student(1,"Alice",98.5));
		fyExamSeatingArrangement.add(new Student(66,"Bharat",68.5));
		fyExamSeatingArrangement.add(new Student(98,"Tom",58.5));
		
		System.out.println(fyExamSeatingArrangement);
		
		System.out.println("FY Result List");
		Set<Student> fyResults=new TreeSet(new PerComparator());   //Desc order of per
		fyResults.add(new Student(18,"Chris",78.5));
		fyResults.add(new Student(45,"Rohit",88.5));
		fyResults.add(new Student(1,"Alice",98.5));
		fyResults.add(new Student(66,"Bharat",68.5));
		fyResults.add(new Student(98,"Tom",58.5));
		
		System.out.println(fyResults);

	}

}
