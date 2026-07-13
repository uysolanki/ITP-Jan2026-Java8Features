package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamingAPIDemo2 {

	public static void main(String[] args) {
		List<Integer> nums=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		nums.stream()
		.filter(s->s%2==1)
		.forEach(System.out::println);
		
	}

}
