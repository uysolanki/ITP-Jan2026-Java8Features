package day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		nums.stream()
		.filter(n->n>=3)
		.forEach(n->System.out.println(n));
		
		
		Map<Boolean,List<Integer>> hashmap=nums.stream()
		.collect(Collectors.partitioningBy(n->n>=3));
		
		System.out.println(hashmap);
		
		//from this hashmap display me numbers >=3
		System.out.println(hashmap.get(true));
		
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		Map<Boolean,List<String>> hashmap1=months.stream()
		.collect(Collectors.partitioningBy(month->month.startsWith("J")));
		
		System.out.println(hashmap1);
		
		Map<Boolean,List<String>> hashmap2=months.stream()
		.collect(Collectors.partitioningBy(month->month.length()>5));
		
		System.out.println(hashmap2);
		
		Map<Boolean,Long> hashmap3=months.stream()
				.collect(Collectors.partitioningBy(month->month.length()>5,Collectors.counting()));
		
		
		System.out.println(hashmap3);
		
		//how may months are there with more than 5 chars
		System.out.println("There are " + hashmap3.get(true) + " months with more than 5 chars");
		
		
								
	}

}

//{false=[March, April, May, June, July], true=[January, February, August, September, October, November, December]}
//{false=5, true=7}

