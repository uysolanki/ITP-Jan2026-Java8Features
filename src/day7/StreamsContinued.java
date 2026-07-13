package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class StreamsContinued {
public static void main(String[] args) {
	List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
	
	//display all months whose length>5
	
	months.stream()
	.filter(month->month.length()>5)
	.forEach(month->System.out.println(month));
	
	
	//display all months whose length>5 in capital
	
		months.stream()
		.filter(month->month.length()>5)
		.map(month->month.toUpperCase())
		.forEach(month->System.out.println(month));
		
	//display all months whose length>5 in capital using method ref
		
		months.stream()
		.filter(month->month.length()>5)
		.map(String::toUpperCase)
		.forEach(System.out::println);
		
	//display all months whose length>5 in capital using method ref display in asc order
		
		months.stream()
		.filter(month->month.length()>5)
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);   

		//display all months whose length>5 in capital using method ref display in desc order
		
				months.stream()
				.filter(month->month.length()>5)
				.map(String::toUpperCase)
				.sorted(Collections.reverseOrder())
				.forEach(System.out::println);   


}
}
