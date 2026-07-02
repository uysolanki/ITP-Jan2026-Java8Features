package day1;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurance3 {
public static void main(String[] args) {
	String sentance="one two one three one one two four four";
	String words[]=sentance.split(" "); //[one, two, three, one, two, four, four]
	
	Map<String,Integer> hashmap=new HashMap();
	
	for(String word:words)		//word							//one
		hashmap.put(word, hashmap.getOrDefault(word, 1)+1);
	
	
	System.out.println(hashmap);	
}
}


/*
{
one 3
two 1
three 1
}
*/
