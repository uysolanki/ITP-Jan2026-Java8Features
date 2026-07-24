package day11;

import java.io.File;
import java.util.ArrayList;
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
        
        //display name of student who have scored more than 80 in englisg
        
        List<String> studNames=students.stream()
        .filter(stud->stud.getMarks().getEnglish()>80)
        .map(stud->stud.getSname())
        .toList();
        
        System.out.println(studNames);
        
        List<String> studNames1=new ArrayList();
        for(Student stud:students)
        {
        	if(stud.getMarks().getEnglish()>80)
        	{
        		studNames1.add(stud.getSname());
        	}
        }
        
        System.out.println(studNames1);
        
        
 
}
}
