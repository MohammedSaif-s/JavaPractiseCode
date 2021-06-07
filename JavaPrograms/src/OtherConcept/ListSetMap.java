package OtherConcept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListSetMap
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		list.add("Mango");
		list.add("Grapes");
		list.add("Banana");
		
		list.add(1, "Guava");
		list.add(3, "Fruits");
		
		for (String st : list)
			System.out.println("All fruits lists are: " + st);
		
		Set<String> set = new HashSet<String>();		
		set.add("Pen");
		set.add("Box");
		set.add("Students");
		for (String se: set)
			System.out.println("All set values are: " + se);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Fan");
		map.put(2, "CeilingFan");
		map.put(3, "Table");
		
		for (Map.Entry ma: map.entrySet())
			System.out.println(ma.getKey() + "----" +ma.getValue());
	}
}