package JavaPractice;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class DuplicateStringAndOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Below code is for find duplicate characters and its number of occurence
		
		/*String str = "W3SCCCHOOLSS";
		HashMap<Character, Integer> map = new HashMap<>();
		char[]a = str.toCharArray();
		for (char ch : a) {
			if (map.containsKey(ch)) {
				int val = map.get(ch);
				map.put(ch, val + 1);
			} else {
				map.put(ch, 1);
			}
		}
		Set<Character> set = map.keySet();
		
		for(Character s:set)
		{
			System.out.println("Duplicate word " +s+ " Occurence " +map.get(s)+ " Times");
		}*/
		
		//Below code is for find duplicate words and its number of occurence
		
		String str= "Java program is a good good good program";
		
		String[] strArray = str.split(" ");
		
         HashMap <String,Integer> map = new HashMap<>();
		
		for(String s : strArray)
		{
			if(map.containsKey(s))
			{
				int val =map.get(s);
				map.put(s, val + 1);
			}
			else
			{
				map.put(s, 1);
			}
		}
		
		
		Set<String> set = map.keySet();
		
		for(String s:set)
		{
			if(map.get(s) > 1) // This condition gives you only the duplicate character and its occurence. If you remove it gives all the charaters occurenece
			{                     
				System.out.println("Duplicate word " +s+ " Occurence " +map.get(s)+ " Times");
			}
			
		}
		
		
		
	}
		
		

}
