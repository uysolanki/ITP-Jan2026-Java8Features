package day4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Comparator<Student> compareByRollNumber=(s1,s2)->{
			if(s1.getRno() > s2.getRno())						//Asc order of roll number
				return 1;
			else if(s1.getRno() < s2.getRno())
				return -1;
			else
				return 0;
				
		};
		
		System.out.println("FY Attendance List");
		Set<Student> fyStudentsAttendance=new TreeSet(compareByRollNumber);   //Asc order of roll number
		fyStudentsAttendance.add(new Student(18,"Chris",78.5));
		fyStudentsAttendance.add(new Student(45,"Rohit",88.5));
		fyStudentsAttendance.add(new Student(1,"Alice",98.5));
		fyStudentsAttendance.add(new Student(66,"Bharat",68.5));
		fyStudentsAttendance.add(new Student(98,"Tom",58.5));
		System.out.println(fyStudentsAttendance);
		
		
		Comparator<Student> compareByName=(s1,s2)-> s1.getSname().compareTo(s2.getSname());
				
		System.out.println("FY Exam Seating List");
		Set<Student> fyExamSeatingArrangement=new TreeSet(compareByName);   //Asc order of name
		fyExamSeatingArrangement.add(new Student(18,"Chris",78.5));
		fyExamSeatingArrangement.add(new Student(45,"Rohit",88.5));
		fyExamSeatingArrangement.add(new Student(1,"Alice",98.5));
		fyExamSeatingArrangement.add(new Student(66,"Bharat",68.5));
		fyExamSeatingArrangement.add(new Student(98,"Tom",58.5));
		System.out.println(fyExamSeatingArrangement);
		
		
		Comparator<Student> compareByPer=(s1,s2)->{if(s1.getPer()> s2.getPer())						//Des order of per
			return -1;
		else if(s1.getPer() < s2.getPer())
			return 1;
		else
			return 0;};
		System.out.println("FY Result List");
		Set<Student> fyResults=new TreeSet(compareByPer);   //Desc order of per
		fyResults.add(new Student(18,"Chris",78.5));
		fyResults.add(new Student(45,"Rohit",88.5));
		fyResults.add(new Student(1,"Alice",98.5));
		fyResults.add(new Student(66,"Bharat",68.5));
		fyResults.add(new Student(98,"Tom",58.5));
		
		System.out.println(fyResults);

	}

}
