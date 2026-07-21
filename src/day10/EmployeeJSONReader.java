package day10;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeJSONReader {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
        try {
            List<Employee> employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );
            
            // Test print
            //employees.forEach(System.out::println);
            
            //display name of all emps
            // employees.stream().map((employee)->employee.getName()).forEach(System.out::println);
            System.out.println("---IT----");
            employees.stream().filter((emp)->emp.getDepartment().equalsIgnoreCase("it")).map((emp)->emp.getName()).forEach(System.out::println);

       
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
