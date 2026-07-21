package day10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentDriverApp2 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Student> students=null;
        try {
            students = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("dir1/student.json"),									  //relative path
                new TypeReference<List<Student>>() {}
            );

	    }
        catch(Exception e1) {}
        
        System.out.println(students);

}
}
