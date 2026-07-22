package day11;

import java.io.File;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StudentDriverApp2 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Student student=null;
        try {
            student = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("dir1/stud.json"),									  //relative path
                new TypeReference<Student>() {}
            );

	    }
        catch(Exception e1) {e1.printStackTrace();}
        
        System.out.println(student);
        

}
}
