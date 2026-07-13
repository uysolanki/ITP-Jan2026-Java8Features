package day6;

import java.util.ArrayList;
import java.util.List;

public class StreamingAPIDemo {

	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
//		//store square of all numbers in seperate list
//		List<Integer> squareNumbers=new ArrayList();
//		
//		for(int n:numbers)
//		{
//			int sqr=n*n;
//			squareNumbers.add(sqr);
//		}
//		
//		//display the list
//		for(int n:squareNumbers)
//		{
//			System.out.println(n);
//		}
		
		
//		List<Integer> squareNumbers1=numbers.stream()   //input [1,2,3,4,5]
//		.map(n->n*n)       //output 1,4,9,16,25    ==>  [1,4,9,16,25]
//		.toList();
//		
//		System.out.println(squareNumbers1);
		
		
		numbers.stream()   		   //input [1,2,3,4,5]
				.map(n->n*n)       //output 1,4,9,16,25    ==>  [1,4,9,16,25]
				.forEach(n->System.out.println(n));
				
		
	}

}
