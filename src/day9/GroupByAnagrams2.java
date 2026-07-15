package day9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByAnagrams2 {
public static void main(String[] args) {
	
	
	String sentance= "silent listen note tone bca abc enot apple cab";
	
	/*
	 [silent,listen] [note,tone,enot],[bca,abc,cab],[apple]
	 */
	
	String words[]=sentance.split(" "); //["silent", "listen", "note", "tone", "bca", "abc", "enot", "apple","cab";
	
	Map<String, List<String>> groupByAnagramHashmap= Arrays.stream(words)
	.collect(Collectors.groupingBy(AnagramStrings2::getSortedString));
	
	System.out.println(groupByAnagramHashmap.values());
}
}
