package day12;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentDriverApp3 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Student> students=null;
        try {
            students = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("dir1/studs.json"),									  //relative path
                new TypeReference<List<Student>>() {}
            );

	    }
        catch(Exception e1) {e1.printStackTrace();}
        
        System.out.println(students);
        
        //display Student names along with total marks
             	 students.stream()
                .forEach(stud-> System.out.println(stud.getSname() + " " + stud.getMarks().totalMarks()));
       //display Student names along with percentage
             	 students.stream()
                .forEach(stud-> System.out.println(stud.getSname() + " " + stud.getMarks().getPercentage()));
             	 
      //display Student percentage sorted by percentage in asc order
             	 students.stream()
             	 .mapToDouble(stud->stud.getMarks().getPercentage())
             	 .sorted()
                 .forEach(System.out::println);
             	 
             	//display Student name percentage sorted by percentage in asc order
             	  students.stream()
             	 .sorted(Comparator.comparing(stud->stud.getMarks().getPercentage()))
             	 .forEach(stud-> System.out.println(stud.getSname() + " " + stud.getMarks().getPercentage()));
              	 
             	//display max percentage
             	  double maxPer=students.stream()
             	  .mapToDouble(stud->stud.getMarks().getPercentage())
             	  .max()
             	  .orElse(0.0);
             	  
             	  System.out.println("Max Per is "+maxPer);
	
	}
}
