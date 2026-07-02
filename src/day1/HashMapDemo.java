package day1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {

	public static void main(String[] args) {
			Map<String,Double> employees=new HashMap<String, Double>();
			
			employees.put("Alice", 800.0);
			employees.put("Ben", 900.0);
			employees.put("Chris", 1000.0);
			employees.put("David", 1100.0);
			employees.put(null, 1200.0);
			
			employees.put("Elcid", null);
			employees.put("Frank", null);
			
			employees.put("Alice", 999.0);
			System.out.println(employees);


	}

}


/*
	Employee Name                  Employee Salary
	Alice							800.0
	Ben								900.0
	Chris							1000.0

*/