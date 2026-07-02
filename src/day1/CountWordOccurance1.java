package day1;

import java.util.HashMap;
import java.util.Map;

public class CountWordOccurance1 {
public static void main(String[] args) {
	String sentance="one two one three one one two four four";
	String words[]=sentance.split(" "); //[one, two, three, one, two, four, four]
	
	Map<String,Integer> hashmap=new HashMap();
	
	for(String word:words)		//word
	{							//one
		if(hashmap.containsKey(word))
		{
			int currentValue=hashmap.get(word);		//currentValue=3;
			currentValue++;
			hashmap.put(word, currentValue);
		}
		else
		{
			hashmap.put(word, 1);
		}
	}
	
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
