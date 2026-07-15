package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		
		Map<Integer,List<String>> hashmap4=months.stream()
				.collect(Collectors.groupingBy(n->n.length()));
				System.out.println(hashmap4);
				
				Map<Integer,Long> hashmap5=months.stream()
						.collect(Collectors.groupingBy(n->n.length(),Collectors.counting()));
						System.out.println(hashmap5);
						
				//how many months have 8 chars
				System.out.println("There are " + hashmap5.get(8) + " months having 8 chars");


	}

}
